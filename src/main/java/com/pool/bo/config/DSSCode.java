package com.pool.bo.config;

public class DSSCode {

  //	strings
  public static final String STR_RETURN_STATUS = "ec";
  public static final String SCHEMA = "public";

  public static final int SUMMARY_LIMIT = 20;
  public static final int WIN_NUMBER_LIMIT = 20;

  //	user type
  public static final int USER_TYPE_PLAYER = 1;
  public static final int USER_TYPE_AGENT = 2;
  public static final int USER_TYPE_SUB = 3;

  //	user level
  public static final int USER_LEVEL_COMPANY = 9;
  public static final int USER_LEVEL_SS = 8;
  public static final int USER_LEVEL_SM = 7;
  public static final int USER_LEVEL_MA = 6;
  public static final int USER_LEVEL_AG = 5;

  //	new DSS code

  //	general14111
  public static final int SUCCESS = 0;
  public static final int UNKNOWN_ERROR = -1;
  public static final int INVALID_JSON_FORMAT = -2;
  public static final int ROLLBACK_DATA = -4;
  public static final int DATABASE_ERROR = -3;

  public static final int USER_NOT_FOUND = 10000;
  public static final int PARENT_NOT_FOUND = 10001;
  public static final int MISSING_ID_PARENT = 10002;
  public static final int MISSING_USERNAME = 10003;
  public static final int MISSING_NICKNAME = 10004;
  public static final int MISSING_USER_TIMEZONE = 10005;
  public static final int MISSING_USER_TYPE = 10006;
  public static final int MISSING_USER_LEVEL = 10007;
  public static final int MISSING_USER_FIRST_NAME = 10008;
  public static final int MISSING_USER_LAST_NAME = 10009;
  public static final int MISSING_USER_PHONE = 10010;
  public static final int MISSING_USER_HANDPHONE = 10011;
  public static final int MISSING_USER_PASSWORD = 10012;
  public static final int MISSING_USER_PIN = 10013;
  public static final int MISSING_USER_IP = 10014;
  public static final int MISSING_STATUS = 10015;
  public static final int MISSING_IP = 10016;
  public static final int MISSING_COMMISSION = 10017;
  public static final int USER_UNDEFINED_USER_PARENT = 10018;
  public static final int USER_MISSING_BETTING = 10019;
  public static final int USER_USERNAME_EXIST = 10020;
  public static final int MISSING_PROVIDER_GAME = 10021;
  public static final int MISSING_COMMISSION_VALUE = 10022;
  public static final int MISSING_USER_CREDIT = 10023;
  public static final int MISSING_USER_TOKEN = 10024;

  public static final int GAME_NO_ACTIVE_GAME = 11000;
  public static final int GAME_ID_NOT_FOUND = 11001;
  public static final int GAME_UNDEFINED_PROVIDER_ID = 11002;
  public static final int GAME_MISSING_NAME = 11003;
  public static final int GAME_MISSING_API = 11004;
  public static final int GAME_MISSING_STATUS = 11005;
  public static final int GAME_NAME_EXIST = 11006;

  public static final int PROVIDER_GAME_NO_ACTIVE_PROVIDER_GAME = 12000;
  public static final int PROVIDER_GAME_ID_NOT_FOUND = 12001;
  public static final int PROVIDER_GAME_UNDEFINED_PROVIDER_ID = 12002;
  public static final int PROVIDER_GAME_MISSING_NAME = 12003;
  public static final int PROVIDER_GAME_MISSING_API = 12004;
  public static final int PROVIDER_GAME_MISSING_STATUS = 12005;
  public static final int PROVIDER_GAME_NAME_EXIST = 12006;
  public static final int PROVIDER_GAME_MISSING_TIMEZONE = 12007;
  public static final int PROVIDER_GAME_MISSING_PROVIDER = 12008;
  public static final int PROVIDER_GAME_MISSING_GAME = 12009;
  public static final int PROVIDER_GAME_PROVIDER_EXIST = 12010;

  public static final int GAME_BET_TYPE_NO_ACTIVE_GAME_BET_TYPE = 13000;
  public static final int GAME_BET_TYPE_ID_NOT_FOUND = 13001;
  public static final int GAME_BET_TYPE_MISSING_NAME = 13003;
  public static final int GAME_BET_TYPE_MISSING_API = 13004;
  public static final int GAME_BET_TYPE_MISSING_STATUS = 13005;
  public static final int GAME_BET_TYPE_NAME_EXIST = 13006;
  public static final int GAME_BET_TYPE_MISSING_PROVIDER_GAME = 13007;
  public static final int GAME_BET_TYPE_MISSING_MAX_NUMBER = 13010;
  public static final int GAME_BET_TYPE_MISSING_ALIAS_NAME = 13011;
  public static final int GAME_BET_TYPE_MISSING_PRIZE = 13012;
  public static final int GAME_BET_TYPE_MISSING_COMBINATION = 13013;
  public static final int GAME_BET_TYPE_MISSING_MAX_PRIZE = 13014;

  public static final int GAME_BET_NO_ACTIVE_GAME_BET_TYPE = 14000;
  public static final int GAME_BET_ID_NOT_FOUND = 14001;
  public static final int GAME_BET_NOT_FOUND = 14002;
  public static final int GAME_BET_MISSING_NAME = 14003;
  public static final int GAME_BET_MISSING_API = 14004;
  public static final int GAME_BET_MISSING_STATUS = 14005;
  public static final int GAME_BET_DAY_EXIST = 14006;
  public static final int GAME_BET_MISSING_PROVIDER_GAME = 14007;
  public static final int GAME_BET_MISSING_START_TIME = 14008;
  public static final int GAME_BET_MISSING_END_TIME = 14009;
  public static final int GAME_BET_NOT_START_YET = 14110;
  public static final int GAME_BET_HAS_BEEN_CLOSED = 14111;
  public static final int GAME_BET_MISSING_DAY = 14112;
  public static final int GAME_BET_TODAY_NOT_OPEN = 14113;
  public static final int GAME_BET_START_EQUAL_END = 14114;
  public static final int GAME_BET_START_LESS_END = 14115;
  public static final int GAME_BET_NOT_CLOSED_YET = 14116;

  public static final int PROVIDER_GAME_BET_TYPE_NO_ACTIVE_GAME_BET_TYPE = 15000;
  public static final int PROVIDER_GAME_BET_TYPE_ID_NOT_FOUND = 15001;
  public static final int PROVIDER_GAME_BET_TYPE_ID_USER = 15002;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_NAME = 15003;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_STATUS = 15005;
  public static final int PROVIDER_GAME_BET_TYPE_NAME_EXIST = 15006;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_PROVIDER_GAME = 15007;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_MAX_NUMBER = 15010;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_ALIAS_NAME = 15011;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_PRIZE = 15012;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_COMBINATION = 15013;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_GAME_TYPE = 15014;
  public static final int PROVIDER_GAME_BET_TYPE_MISSING_TOKEN = 15015;

  public static final int USER_BET_SETTING_NO_ACTIVE = 16000;
  public static final int USER_BET_SETTING_ID_NOT_FOUND = 16001;
  public static final int USER_BET_SETTING_MISSING_USER_ID = 16002;
  public static final int USER_BET_SETTING_MISSING_PROVIDER_BET_TYPE = 16003;
  public static final int USER_BET_SETTING_MISSING_PRIZE = 16004;
  public static final int USER_BET_SETTING_MISSING_IP = 16005;
  public static final int USER_BET_SETTING_MISSING_USER = 16006;
  public static final int USER_BET_SETTING_MISSING_GAME_TYPE_ID = 16007;
  public static final int USER_BET_SETTING_MISSING_PROVIDER_GAME_ID = 16008;
  public static final int USER_BET_SETTING_MISSING_TOKEN = 16009;
  public static final int USER_BET_SETTING_MISSING_AMOUNT = 16015;

  public static final int PROVIDER_WIN_NUMBER_NO_ACTIVE_PROVIDER_GAME = 17000;
  public static final int PROVIDER_WIN_NUMBER_ID_NOT_FOUND = 17001;
  public static final int PROVIDER_WIN_NUMBER_UNDEFINED_PROVIDER_ID = 17002;
  public static final int PROVIDER_WIN_NUMBER_MISSING_NAME = 17003;
  public static final int PROVIDER_WIN_NUMBER_MISSING_API = 17004;
  public static final int PROVIDER_WIN_NUMBER_MISSING_STATUS = 17005;
  public static final int PROVIDER_WIN_NUMBER_NAME_EXIST = 17006;
  public static final int PROVIDER_WIN_NUMBER_MISSING_TIMEZONE = 17007;
  public static final int PROVIDER_WIN_NUMBER_MISSING_PROVIDER_GAME_ID = 17008;
  public static final int PROVIDER_WIN_NUMBER_MISSING_GAME = 17009;
  public static final int PROVIDER_WIN_NUMBER_MISSING_WIN_NUMBER = 17010;
  public static final int PROVIDER_WIN_NUMBER_MISSING_ID_USER = 17011;
  public static final int PROVIDER_WIN_NUMBER_LATEST_NOT_PROCCESS_YET = 17012;

  public static final int PROVIDER_NO_ACTIVE_PROVIDER = 18000;
  public static final int PROVIDER_ID_NOT_FOUND = 18001;
  public static final int PROVIDER_UNDEFINED_PROVIDER_ID = 18002;
  public static final int PROVIDER_MISSING_NAME = 18003;
  public static final int PROVIDER_MISSING_API = 18004;
  public static final int PROVIDER_MISSING_STATUS = 18005;
  public static final int PROVIDER_NAME_EXIST = 18006;

  public static final int USER_WINLOST_OUTSTANDING_GROUP_ID_NOT_FOUND = 19000;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_MISSING_PROVIDER_GAME_ID = 19001;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_MISSING_ID_USER = 19002;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_MISSING_START_DATE = 19003;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_MISSING_END_DATE = 19004;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_MISSING_HASHKEY = 19017;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_CANNOT_PRINTED = 19018;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_ALREADY_CLAIM = 19019;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_NOT_TIME_CLAIM = 19020;
  public static final int USER_WINLOST_OUTSTANDING_GROUP_UNDEFINED_USER_ID_AND_HASHKEY = 19021;

  //	user session
  public static final int USER_SESSION_ID_NOT_FOUND = 20000;
  public static final int USER_SESSION_USER_NOT_FOUND = 20001;
  public static final int USER_SESSION_MISSING_ID_USER = 20005;
  public static final int USER_SESSION_MISSING_SESSION = 20021;
  public static final int USER_SESSION_MISSING_IP = 20022;
  public static final int USER_SESSION_MISSING_TOKEN = 20023;
  public static final int USER_SESSION_UNDEFINED_SESSION = 20067;

  //	user password
  public static final int USER_PASSWORD_ID_NOT_FOUND = 21000;
  public static final int USER_PASSWORD_USER_NOT_FOUND = 21001;
  public static final int USER_PASSWORD_UNDEFINED_PASSWORD = 21002;

  //	historical commission
  public static final int HISTORICAL_COMMISSION_ID_NOT_FOUND = 25000;
  public static final int HISTORICAL_COMMISSION_USER_NOT_FOUND = 25001;
  public static final int HISTORICAL_COMMISSION_TO_HIGH = 25002;
  public static final int HISTORICAL_COMMISSION_TO_LOW = 25003;
  public static final int HISTORICAL_COMMISSION_SAME_VALUE = 25004;
  public static final int HISTORICAL_COMMISSION_MISSING_ID_USER = 25005;
  public static final int HISTORICAL_COMMISSION_MISSING_ID_PARENT = 25006;
  public static final int HISTORICAL_COMMISSION_MISSING_PROVIDER_GAME_ID = 25036;
  public static final int HISTORICAL_COMMISSION_MISSING_USER = 25071;
  public static final int HISTORICAL_COMMISSION_MISSING_COMMISSION = 25073;

  //	historical effective commission
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_ID_NOT_FOUND = 26000;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_USER_NOT_FOUND = 26001;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_TO_HIGH = 26002;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_TO_LOW = 26003;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_SAME_VALUE = 26004;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_MISSING_ID_USER = 26005;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_MISSING_ID_PARENT = 26006;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_MISSING_PROVIDER_GAME_ID = 26036;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_MISSING_USER = 26071;
  public static final int HISTORICAL_EFFECTIVE_COMMISSION_MISSING_GROUP_COMMISSION = 26073;

  //	outstanding
  public static final int USER_WINLOST_OUTSTANDING_ID_NOT_FOUND = 27000;
  public static final int USER_WINLOST_OUTSTANDING_MISSING_PROVIDER_GAME_ID = 27001;
  public static final int USER_WINLOST_OUTSTANDING_MISSING_ID_USER = 27002;
  public static final int USER_WINLOST_OUTSTANDING_MISSING_PROVIDER_GAME_BET_TYPE_ID = 27003;
  public static final int USER_WINLOST_OUTSTANDING_MISSING_START_DATE = 27004;
  public static final int USER_WINLOST_OUTSTANDING_MISSING_END_DATE = 27005;

  //	user winlost history
  public static final int USER_WINLOST_HISTORY_ID_NOT_FOUND = 35000;
  public static final int USER_WINLOST_HISTORY_USER_NOT_FOUND = 35001;
  public static final int USER_WINLOST_HISTORY_MISSING_ID_USER = 35005;
	//	public static final int USER_WINLOST_HISTORY_MISSING_PROVIDER_GAME_ID = 35008;

  //	user winlost history
  public static final int USER_WINLOST_ID_NOT_FOUND = 36000;
  public static final int USER_WINLOST_USER_NOT_FOUND = 36001;
  public static final int USER_WINLOST_MISSING_ID_USER = 36005;
  public static final int USER_WINLOST_MISSING_ID_PARENT = 36006;

  //	user security
  public static final int USER_SECURITY_ID_NOT_FOUND = 37000;
  public static final int USER_SECURITY_MISSING_ID_USER = 37001;
  public static final int USER_SECURITY_MISSING_SECURITY_CODE = 37002;
  public static final int USER_SECURITY_MISSING_IP = 37022;
  public static final int USER_SECURITY_UNDEFINED_USER_OR_CODE = 37023;

  //	user log
  public static final int LOG_ID_NOT_FOUND = 38000;
  public static final int LOG_USER_NOT_FOUND = 38001;
  public static final int LOG_MISSING_ID_USER = 38005;
  public static final int LOG_MISSING_TYPE = 38008;

  //	user transaction
  public static final int USER_TRX_ID_NOT_FOUND = 39000;
  public static final int USER_TRX_USER_NOT_FOUND = 39001;
  public static final int USER_TRX_MISSING_ID_USER = 39005;
  public static final int USER_TRX_MISSING_ID_PARENT = 39006;
  public static final int USER_TRX_MISSING_TYPE = 39007;
  public static final int USER_TRX_MISSING_AMOUNT = 39015;
  public static final int USER_TRX_MISSING_IP = 39022;
  public static final int USER_TRX_MISSING_COMPANY_BANK = 39024;
  public static final int USER_TRX_MISSING_USER_BANK = 39025;
  public static final int USER_TRX_HAD_PENDING_TRX = 39026;
  public static final int USER_TRX_AMOUNT_GREATER_THAN_CREDIT = 39027;
  public static final int USER_TRX_NOT_A_PLAYER = 39028;

  //	user website
  public static final int USER_WEBSITE_NO_ACTIVE_SITE = 40000;
  public static final int USER_WEBSITE_ID_NOT_FOUND = 40001;
  public static final int USER_WEBSITE_MISSING_URL = 40003;
  public static final int USER_WEBSITE_MISSING_TOKEN = 40004;
  public static final int USER_WEBSITE_MISSING_ID_USER = 40005;
  public static final int USER_WEBSITE_MISSING_STATUS = 40006;
  public static final int USER_WEBSITE_EXIST = 40020;
  public static final int USER_WEBSITE_DELETED = 40021;
  public static final int USER_WEBSITE_UNDEFINED_TOKEN = 40022;
  public static final int USER_WEBSITE_UNDEFINED_USER = 40023;

  //	user provider
  public static final int USER_PROVIDER_GAME_ID_NOT_FOUND = 41000;
  public static final int USER_PROVIDER_GAME_MISSING_ID_PARENT = 41001;
  public static final int USER_PROVIDER_GAME_MISSING_ID_USER = 41002;
  public static final int USER_PROVIDER_GAME_MISSING_ID_PROVIDER_GAME = 41003;
  public static final int USER_PROVIDER_GAME_PARENT_NOT_FOUND = 41004;
  public static final int USER_PROVIDER_GAME_PARENT_NOT_ACTIVE = 41005;
  public static final int USER_PROVIDER_GAME_UNDEFINED_USER = 41006;
  public static final int USER_PROVIDER_GAME_MISSING_TOKEN = 41007;

  //	user token
  public static final int USER_TOKEN_NO_ACTIVE_SITE = 42000;
  public static final int USER_TOKEN_ID_NOT_FOUND = 42001;
  public static final int USER_TOKEN_MISSING_URL = 42003;
  public static final int USER_TOKEN_MISSING_TOKEN = 42004;
  public static final int USER_TOKEN_MISSING_ID_USER = 42005;
  public static final int USER_TOKEN_MISSING_STATUS = 42006;
  public static final int USER_TOKEN_EXIST = 42020;
  public static final int USER_TOKEN_CLOSED = 42021;
  public static final int USER_TOKEN_UNDEFINED_TOKEN = 42022;
  public static final int USER_TOKEN_UNDEFINED_USER = 42023;

}