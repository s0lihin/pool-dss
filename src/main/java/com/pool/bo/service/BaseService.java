package com.pool.bo.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pool.bo.dto.ErrorResponse;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.RequestBaseDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseService {

  protected Mono<KafkaMessage> onFailurehandler(KafkaMessage finalMessage, final int errorCode, final String errorMessage) {
    return Mono.fromSupplier(
      () -> {
        try {
          ErrorResponse errorResponse = new ErrorResponse(
            errorCode,
            errorMessage);

          Type typeToken = new TypeToken<ErrorResponse>() {
          }.getType();

          return new KafkaMessage(
            finalMessage.getClientCode(),
            finalMessage.getMethod(),
            finalMessage.getMessageId(),
            errorCode,
            new Gson().toJson(errorResponse, typeToken)
          );
        } catch (RuntimeException ex) {
          ErrorResponse errorResponse = new ErrorResponse(
            errorCode,
            ex.getMessage()
          );

          Type typeToken = new TypeToken<ErrorResponse>() {
          }.getType();

          return new KafkaMessage(
            finalMessage.getClientCode(),
            finalMessage.getMethod(),
            finalMessage.getMessageId(),
            errorCode,
            new Gson().toJson(errorResponse, typeToken)
          );
        }
      }
    );
  }

  protected <T extends RequestBaseDto> Flux<Timestamp> isValidRequest(T request) {
    return Flux.just(isValid(request))
      .filter(valid -> valid)
      .switchIfEmpty(Flux.empty())
      .map(valid -> dateFormatToTimestamp(request.getNow()));
  }

  protected <T extends RequestBaseDto> boolean isValid(T request) {
    return request.getUserId() != null
      && request.getUserId() != 0
      && request.getNow() != null
      && !request.getNow().trim().equals("");
  }

  protected Timestamp dateFormatToTimestamp(String datetime) throws RuntimeException {
    Timestamp timestamp;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
      Date parse = dateFormat.parse(datetime);
      timestamp = new Timestamp(parse.getTime());
    } catch (ParseException ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex.getMessage(), ex);
    }
    return timestamp;
  }
}
