package com.pool.bo.config;

public class DSSStatusCode {

  //  strings
  public static String STR_RETURN_STATUS = "ec";
  public static final String SCHEMA = "public";
  //  public static final String SCHEMA = "main_manila";

  //  user type
  public static final int USER_TYPE_PLAYER = 1;
  public static final int USER_TYPE_AGENT = 2;
  public static final int USER_TYPE_SUB = 3;

  //  user level
  public static final int USER_LEVEL_COMPANY = 9;
  public static final int USER_LEVEL_SS = 8;
  public static final int USER_LEVEL_SM = 7;
  public static final int USER_LEVEL_MA = 6;
  public static final int USER_LEVEL_AG = 5;

  //  new DSS code

  //  general
  public static int SUCCESS = 0;
  public static int UNKNOWN_ERROR = -1;
  public static int INVALID_JSON_FORMAT = -2;
  public static int DATABASE_ERROR = -3;
  public static int ROLLBACK_DATA = -4;

  //  user
  public static int USER_NOT_FOUND = 10000;
  public static int PARENT_NOT_FOUND = 10001;
  public static int USERNAME_EXIST = 10002;
  public static int MISSING_USERNAME = 10003;
  public static int MISSING_NICKNAME = 10004;
  public static int MISSING_ID_USER = 10005;
  public static int MISSING_ID_PARENT = 10006;
  public static int MISSING_TIMEZONE = 10007;
  public static int MISSING_TYPE = 10008;
  public static int MISSING_FIRSTNAME = 10009;
  public static int MISSING_LASTNAME = 10010;
  public static int MISSING_PHONE = 10011;
  public static int MISSING_HANDPHONE = 10012;
  public static int MISSING_CURRENCY_ID = 10013;
  public static int CURRENCY_NOT_FOUND = 10014;
  public static int MISSING_STATUS = 10015;
  public static int MISSING_IP = 10016;
  public static int MISSING_PASSWORD = 10017;
  public static int MISSING_PIN = 10018;
  public static int MISSING_WELCOME_MESSAGE = 10019;
  public static int MISSING_CODE = 10054;
  public static int MISSING_USER_TYPE = 10055;
  public static int MISSING_LEVEL = 10056;
  public static int NICKNAME_EXIST = 10065;
  public static int MISSING_USER_TRANSFER = 10066;
  public static int UNDEFINED_LEVEL_AGENT = 10067;
  public static int USER_CREDIT_GREATER_THAN_SELF_LIMIT = 10074;
  public static int USER_CREDIT_LESS_THAN_TOTAL_CHILD = 10075;
  public static int MISSING_USER_MAX_CREDIT_LIMIT = 10076;
  public static int USER_MAX_CREDIT_LIMIT_GREATER_THEN_SELF_MAX_CREDIT_LIMIT = 10077;
  public static int USER_MAX_CREDIT_LIMIT_GREATER_THEN_CREDIT_LIMIT = 10078;
  public static int USER_CREDIT_LIMIT_GREATER_THEN_SELF_MAX_CREDIT_LIMIT = 10079;
  public static int USER_MISSING_AMOUNT = 10080;
  public static int USER_MISSING_SESSION = 10021;
  public static int USER_INVALID_BET_AMOUNT = 10084;
  public static int USER_MISSING_GAME_SUB_ID = 10037;
  public static int USER_MISSING_PROVIDER_GAME_ID = 10038;
  public static int USER_BET_GREATER_BET_SETTING_MAX_BET = 10085;
  public static int USER_BET_GREATER_BET_SETTING_MAX_PER_MATCH = 10086;
  public static int USER_BET_LESS_BET_SETTING_MIN_BET = 10087;
  public static int USER_MISSING_BETTING = 10109;

  public static int USER_MISSING_EVENT_ID = 10089;
  public static int USER_MISSING_BET_TYPE = 10090;
  public static int USER_MISSING_EVENT_TYPE = 10091;
  public static int USER_MISSING_SELECTION_TYPE = 10092;
  public static int USER_MISSING_HANDICAP = 10093;
  public static int USER_MISSING_STAKE = 10094;
  public static int USER_MISSING_ODDS_ID = 10095;
  public static int USER_MISSING_ODDS = 10096;
  public static int USER_MISSING_ODDS_TYPE = 10097;
  public static int USER_MISSING_IP = 10098;
  public static int USER_MISSING_OUTSTANDING_STATUS = 10099;
  public static int USER_UNDEFINED_PARENT = 10101;
  public static int USER_MISSING_OUTSTANDING_ID = 10102;
  public static int USER_MISSING_TICKET_ID = 10103;
  public static int USER_MISSING_STATUS = 10104;
  public static int USER_MISSING_EVENT_STATUS = 10105;
  public static int USER_MISSING_TRUCKTOR_USERNAME = 10106;
  public static int USER_MISSING_WINLOST_PROVIDER = 10107;
  public static int USER_MISSING_FAV_TYPE = 10108;

  //  user log
  public static int LOG_ID_NOT_FOUND = 11000;
  public static int LOG_USER_NOT_FOUND = 11001;
  public static int LOG_MISSING_ID_USER = 11005;

  //  user password
  public static int USER_PASSWORD_ID_NOT_FOUND = 12000;
  public static int USER_PASSWORD_USER_NOT_FOUND = 12001;
  public static int USER_PASSWORD_MISSING_ID_USER = 12005;
  public static int USER_PASSWORD_MISSING_PASSWORD = 12017;

  //  user pin
  public static int USER_PIN_ID_NOT_FOUND = 13000;
  public static int USER_PIN_USER_NOT_FOUND = 13001;
  public static int USER_PIN_MISSING_ID_USER = 13005;
  public static int USER_PIN_MISSING_PIN = 13020;

  //  user session
  public static int USER_SESSION_ID_NOT_FOUND = 14000;
  public static int USER_SESSION_USER_NOT_FOUND = 14001;
  public static int USER_SESSION_MISSING_ID_USER = 14005;
  public static int USER_SESSION_MISSING_SESSION = 14021;
  public static int USER_SESSION_UNDEFINED_SESSION = 14067;

  //  user status
  public static int USER_STATUS_ID_NOT_FOUND = 15000;
  public static int USER_STATUS_USER_NOT_FOUND = 15001;
  public static int USER_STATUS_MISSING_ID_USER = 15005;
  public static int USER_STATUS_MISSING_STATUS = 15015;
  public static int USER_STATUS_USER_INACTIVE = 15058;

  //  user welcome message
  public static int WELCOME_MESSAGE_ID_NOT_FOUND = 16000;
  public static int WELCOME_MESSAGE_USER_NOT_FOUND = 16001;
  public static int WELCOME_MESSAGE_MISSING_ID_USER = 16005;
  public static int WELCOME_MESSAGE_MISSING_WELCOME_MESSAGE = 16022;
  public static int WELCOME_MESSAGE_GREATER_500 = 16088;

  //  currency
  public static int CURRENCY_ID_NOT_FOUND = 18000;
  public static int CURRENCY_NAME_EXIST = 18002;
  public static int CURRENCY_MISSING_NAME = 18003;
  public static int CURRENCY_MISSING_STATUS = 18015;
  public static int CURRENCY_MISSING_CODE = 18023;
  public static int CURRENCY_MISSING_SYMBOL = 18024;

  //  provider game
  public static int PROVIDER_ID_NOT_FOUND = 19000;
  public static int PROVIDER_NAME_EXIST = 19002;
  public static int PROVIDER_MISSING_NAME = 19003;
  public static int PROVIDER_MISSING_TIMEZONE = 19007;
  public static int PROVIDER_MISSING_STATUS = 19015;
  public static int PROVIDER_STATUS_DELETED = 19057;
  public static int PROVIDER_STATUS_INACTIVE = 19058;

  //  acl role
  public static int ROLE_ID_NOT_FOUND = 20000;
  public static int ROLE_MISSING_ROLE = 20025;
  public static int ROLE_MISSING_MODULE_ID = 20026;

  //  acl resource
  public static int RESOURCE_ID_NOT_FOUND = 21000;
  public static int RESOURCE_MISSING_MODULE = 21027;
  public static int RESOURCE_MISSING_CONTROLLER = 21028;
  public static int RESOURCE_MISSING_ACTION = 21029;
  public static int RESOURCE_MISSING_LEVEL = 21030;
  public static int RESOURCE_MISSING_SIDEBAR = 21031;
  public static int RESOURCE_MISSING_SIDEBAR_NAME = 21032;
  public static int RESOURCE_MISSING_SIDEBAR_ICON = 21033;
  public static int RESOURCE_MISSING_SIDEBAR_ORDER = 21034;
  public static int RESOURCE_MISSING_USER_ACL_RESOURCE = 21035;

  //  game bet type
  public static int GAME_BET_TYPE_ID_NOT_FOUND = 22000;
  public static int GAME_BET_TYPE_NAME_EXIST = 22002;
  public static int GAME_BET_TYPE_MISSING_NAME = 22003;
  public static int GAME_BET_TYPE_MISSING_GAME_ID = 22036;
  public static int GAME_BET_TYPE_MISSING_GAME_SUB_ID = 22037;
  public static int GAME_BET_TYPE_MISSING_PROVIDER_ID = 22038;
  public static int GAME_BET_TYPE_MISSING_STATUS = 22039;
  public static int GAME_BET_TYPE_MISSING_API = 22040;
  public static int GAME_BET_TYPE_MISSING_GROUP_BET = 22062;
  public static int GAME_BET_TYPE_MISSING_GROUP_COMMISSION = 22063;

  //  game credit
  public static int GAME_CREDIT_ID_NOT_FOUND = 23000;
  public static int GAME_CREDIT_MISSING_ID_USER = 23005;
  public static int GAME_CREDIT_MISSING_GAME_ID = 23036;
  public static int GAME_CREDIT_MISSING_CREDIT_LIMIT = 23041;
  public static int GAME_CREDIT_MISSING_CREDIT_USE = 23042;
  public static int GAME_CREDIT_GREATER_THAN_SELF = 23074;
  public static int GAME_CREDIT_LESS_THAN_CHILD_TOTAL = 23075;

  //  game
  public static int GAME_ID_NOT_FOUND = 24000;
  public static int GAME_NAME_EXIST = 24002;
  public static int GAME_MISSING_NAME = 24003;
  public static int GAME_MISSING_STATUS = 24015;
  public static int GAME_MISSING_PROVIDER_ID = 24038;
  public static int GAME_MISSING_MAIN_CREDIT = 24043;
  public static int GAME_STATUS_DELETED = 24057;
  public static int GAME_STATUS_INACTIVE = 24058;

  //  game sub
  public static int GAME_SUB_ID_NOT_FOUND = 25000;
  public static int GAME_SUB_NAME_EXIST = 25002;
  public static int GAME_SUB_MISSING_NAME = 25003;
  public static int GAME_SUB_MISSING_GAME_ID = 25036;
  public static int GAME_SUB_MISSING_PROVIDER_ID = 25038;
  public static int GAME_SUB_MISSING_STATUS = 25039;
  public static int GAME_SUB_MISSING_API = 25040;
  public static int GAME_SUB_STATUS_DELETED = 25057;
  public static int GAME_SUB_STATUS_INACTIVE = 25058;

  //  historical commission
  public static int HISTORY_COMMISSION_ID_NOT_FOUND = 26000;
  public static int HISTORY_COMMISSION_USER_NOT_FOUND = 26001;
  public static int HISTORY_COMMISSION_MISSING_ID_USER = 26005;
  public static int HISTORY_COMMISSION_MISSING_ID_PARENT = 26006;
  public static int HISTORY_COMMISSION_MISSING_PROVIDER_GAME_ID = 26036;
  public static int HISTORY_COMMISSION_MISSING_GAME_TYPE_ID = 26044;
  public static int HISTORY_COMMISSION_MISSING_COMMISSION = 26045;
  public static int HISTORY_COMMISSION_MISSING_COMMISSION_A = 26046;
  public static int HISTORY_COMMISSION_MISSING_COMMISSION_B = 26047;
  public static int HISTORY_COMMISSION_MISSING_COMMISSION_C = 26048;
  public static int HISTORY_COMMISSION_MISSING_COMMISSION_D = 26049;
  public static int HISTORY_COMMISSION_MISSING_USER = 26071;
  public static int HISTORY_COMMISSION_MISSING_GROUP_COMMISSION = 26073;

  //  historical position taking agent
  public static int HISTORY_POSITION_TAKING_ID_NOT_FOUND = 27000;
  public static int HISTORY_POSITION_TAKING_USER_NOT_FOUND = 27001;
  public static int HISTORY_POSITION_TAKING_MISSING_ID_USER = 27005;
  public static int HISTORY_POSITION_TAKING_MISSING_GAME_ID = 27036;
  public static int HISTORY_POSITION_TAKING_MISSING_PT_MIN = 27050;
  public static int HISTORY_POSITION_TAKING_MISSING_PT_EFFECTIVE = 27051;
  public static int HISTORY_POSITION_TAKING_MISSING_PT_FORCE = 27052;
  public static int HISTORY_POSITION_TAKING_MISSING_PT_REMAINING = 27053;
  public static int HISTORY_POSITION_TAKING_MISSING_GAME_GROUP_BET = 27062;
  public static int HISTORY_POSITION_TAKING_MISSING_USER = 27071;
  public static int HISTORY_POSITION_TAKING_MISSING_GROUP_BET = 27072;

  //  historical position taking player
  public static int HISTORY_POSITION_TAKING_PLAYER_ID_NOT_FOUND = 34000;
  public static int HISTORY_POSITION_TAKING_PLAYER_USER_NOT_FOUND = 34001;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_ID_USER = 34005;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_GAME_ID = 34036;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_PT_MIN = 34050;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_PT_EFFECTIVE = 34051;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_PT_FORCE = 34052;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_PT_REMAINING = 34053;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_GAME_GROUP_BET = 34062;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_USER = 34071;
  public static int HISTORY_POSITION_TAKING_PLAYER_MISSING_GROUP_BET = 34072;

  //  acl access
  public static int ACCESS_ID_NOT_FOUND = 28000;
  public static int ACCESS_MISSING_NAME = 28003;
  public static int ACCESS_MISSING_ID_USER = 28005;
  public static int ACCESS_MISSING_ROLE = 28025;
  public static int ACCESS_MISSING_MODULE_ID = 28026;

  //  game group bet
  public static int GAME_GROUP_BET_ID_NOT_FOUND = 29000;
  public static int GAME_GROUP_BET_NAME_EXIST = 29002;
  public static int GAME_GROUP_BET_MISSING_NAME = 29003;
  public static int GAME_GROUP_BET_MISSING_STATUS = 29039;

  //  game group commission
  public static int GAME_GROUP_COMMISSION_ID_NOT_FOUND = 30000;
  public static int GAME_GROUP_COMMISSION_NAME_EXIST = 30002;
  public static int GAME_GROUP_COMMISSION_MISSING_NAME = 30003;
  public static int GAME_GROUP_COMMISSION_MISSING_STATUS = 30039;

  //  provider side
  public static int PROVIDER_SIDE_ID_NOT_FOUND = 31000;
  public static int PROVIDER_SIDE_NAME_EXIST = 31002;
  public static int PROVIDER_SIDE_MISSING_NAME = 31003;
  public static int PROVIDER_SIDE_MISSING_STATUS = 31039;
  public static int PROVIDER_SIDE_MISSING_PROVIDER_ID = 31038;
  public static int PROVIDER_SIDE_MISSING_API = 31040;

  //  master module
  public static int MASTER_MODULE_ID_NOT_FOUND = 31000;
  public static int MASTER_MODULE_NAME_EXIST = 31002;
  public static int MASTER_MODULE_MISSING_NAME = 31003;
  public static int MASTER_MODULE_MISSING_STATUS = 31039;
  public static int MASTER_MODULE_MISSING_DISPLAY = 31059;
  public static int MASTER_MODULE_MISSING_AGENT_NOTALLOWED = 31060;
  public static int MASTER_MODULE_MISSING_SUB_NOTALLOWED = 31061;
  public static int MASTER_MODULE_MISSING_ORDER = 31064;

  //  user transfer
  public static int USER_TRANSFER_ID_NOT_FOUND = 32000;
  public static int USER_TRANSFER_USER_NOT_FOUND = 32001;
  public static int USER_TRANSFER_MISSING_ID_USER = 32005;
  public static int USER_TRANSFER_MISSING_ID_PARENT = 32006;
  public static int USER_TRANSFER_MISSING_AMOUNT = 32080;

  //  user bet setting
  public static int USER_BET_SETTING_ID_NOT_FOUND = 33000;
  public static int USER_BET_SETTING_USER_NOT_FOUND = 33001;
  public static int USER_BET_SETTING_MISSING_ID_USER = 33005;
  public static int USER_BET_SETTING_MISSING_GAME_ID = 33036;
  public static int USER_BET_SETTING_MISSING_GAME_TYPE_ID = 33044;
  public static int USER_BET_SETTING_MISSING_MIN_BET = 33068;
  public static int USER_BET_SETTING_MISSING_MAX_BET = 33069;
  public static int USER_BET_SETTING_MISSING_MAX_PER_MATCH = 33070;
  public static int USER_BET_SETTING_INVALID_MAX_PER_MATCH = 33081;
  public static int USER_BET_SETTING_INVALID_MAX_BET = 33082;
  public static int USER_BET_SETTING_INVALID_MIN_BET = 33083;

  //  user winlost history
  public static int USER_WINLOST_HISTORY_ID_NOT_FOUND = 35000;
  public static int USER_WINLOST_HISTORY_USER_NOT_FOUND = 35001;
  public static int USER_WINLOST_HISTORY_MISSING_ID_USER = 35005;

  //  user winlost
  public static int USER_WINLOST_ID_NOT_FOUND = 36000;
  public static int USER_WINLOST_USER_NOT_FOUND = 36001;
  public static int USER_WINLOST_MISSING_ID_USER = 36005;
  public static int USER_WINLOST_MISSING_ID_PLAYER = 36100;

  //  match
  public static int MATCH_ID_NOT_FOUND = 37000;

  //  match member
  public static int MATCH_MEMBER_ID_NOT_FOUND = 38000;

  //  match league
  public static int MATCH_LEAGUE_ID_NOT_FOUND = 39000;

  //  match info
  public static int MATCH_INFO_ID_NOT_FOUND = 40000;

  //  user winlost outstanding
  public static int USER_WINLOST_OUTSTANDING_ID_NOT_FOUND = 41000;
  public static int USER_WINLOST_OUTSTANDING_MISSING_ID_USER = 41005;
  public static int USER_WINLOST_OUTSTANDING_MISSING_ID_PARENT = 41006;
  public static int USER_WINLOST_OUTSTANDING_MISSING_GAME_ID = 41036;
  public static int USER_WINLOST_OUTSTANDING_UNDEFINED_EVENT_ID = 41089;
  public static int USER_WINLOST_OUTSTANDING_MISSING_BET_TYPE = 41090;

}