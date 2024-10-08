package it.auties.whatsapp.util;

import it.auties.whatsapp.binary.BinaryTokens;
import it.auties.whatsapp.model.signal.auth.Version;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;

public class Specification {
    public final static class Whatsapp {
        public static final String DEFAULT_NAME = "Cobalt";
        public static final byte[] NOISE_PROTOCOL = "Noise_XX_25519_AESGCM_SHA256\0\0\0\0".getBytes(StandardCharsets.UTF_8);
        public static final String WEB_ORIGIN = "https://web.whatsapp.com";
        public static final URI WEB_SOCKET_ENDPOINT = URI.create("wss://web.whatsapp.com/ws/chat");
        public static final URI SOCKET_ENDPOINT = URI.create("http://g.whatsapp.net:443");
        public static final String WEB_UPDATE_URL = "https://web.whatsapp.com/check-update?version=2.2245.9&platform=web";
        public static final String MOBILE_IOS_URL = "https://itunes.apple.com/lookup?bundleId=net.whatsapp.WhatsApp";

        //public static final String MOBILE_IOS_USER_AGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 17_3_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.3.1 Mobile/15E148 Safari/604.1";
        public static final String MOBILE_IOS_USER_AGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 17_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.5 Mobile/15E148 Safari/604.1";
        public static final String MOBILE_ANDROID_USER_AGENT = "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.5735.57 Mobile Safari/537.36";
        public static final String MOBILE_BUSINESS_IOS_URL = "https://itunes.apple.com/lookup?bundleId=net.whatsapp.WhatsAppSMB";
        public static final String MOBILE_REGISTRATION_ENDPOINT = "https://v.whatsapp.net/v2";
        public static final String MOBILE_KAIOS_REGISTRATION_ENDPOINT = "https://v-k.whatsapp.net/v2";
        public static final Version MOBILE_DEFAULT_PERSONAL_IOS_VERSION = Version.of("2.24.5.74");
        public static final Version MOBILE_DEFAULT_BUSINESS_IOS_VERSION = Version.of("2.24.4.78");
        public static final int GPIA_TOKEN_LENGTH = 430;
        private static final byte[] WHATSAPP_VERSION_HEADER = "WA".getBytes(StandardCharsets.UTF_8);
        private static final byte[] WEB_VERSION = new byte[]{6, BinaryTokens.DICTIONARY_VERSION};
        public static final byte[] WEB_PROLOGUE = Bytes.concat(WHATSAPP_VERSION_HEADER, WEB_VERSION);
        private static final byte[] MOBILE_VERSION = new byte[]{5, BinaryTokens.DICTIONARY_VERSION};
        public static final byte[] MOBILE_PROLOGUE = Bytes.concat(WHATSAPP_VERSION_HEADER, MOBILE_VERSION);
        public static final byte[] ACCOUNT_SIGNATURE_HEADER = {6, 0};
        public static final byte[] DEVICE_WEB_SIGNATURE_HEADER = {6, 1};
        public static final byte[] DEVICE_MOBILE_SIGNATURE_HEADER = {6, 2};
        public static final int MAX_COMPANIONS = 5;
        public static final int THUMBNAIL_WIDTH = 480;
        public static final int THUMBNAIL_HEIGHT = 339;
        public static final byte[] REGISTRATION_PUBLIC_KEY = HexFormat.of().parseHex("8e8c0f74c3ebc5d7a6865c6c3c843856b06121cce8ea774d22fb6f122512302d");
        public static final String MOBILE_IOS_STATIC = "0a1mLfGUIBVrMKF1RdvLI5lkRBvof6vn0fD2QRSM";
        public static final String MOBILE_BUSINESS_IOS_STATIC = "USUDuDYDeQhY4RF2fCSp5m3F6kJ1M2J8wS7bbNA2";
        public static final int COMPANION_PAIRING_TIMEOUT = 10;
        public static final int DEFAULT_HISTORY_SIZE = 59206;
        public static final byte[][] CALL_RELAY = new byte[][]{
                new byte[]{-105, 99, -47, -29, 13, -106},
                new byte[]{-99, -16, -53, 62, 13, -106},
                new byte[]{-99, -16, -25, 62, 13, -106},
                new byte[]{-99, -16, -5, 62, 13, -106},
                new byte[]{-71, 60, -37, 62, 13, -106}
        };
        public static final String BUSINESS_NAME_VCARD_PROPERTY = "X-WA-BIZ-NAME";
        public static final String PHONE_NUMBER_VCARD_PROPERTY = "WAID";
        public static final String DEFAULT_NUMBER_VCARD_TYPE = "CELL";
    }

    public final static class Signal {
        public static final int CURRENT_VERSION = 3;
        public static final int IV_LENGTH = 16;
        public static final int KEY_LENGTH = 32;
        public static final int MAC_LENGTH = 8;
        public static final int SIGNATURE_LENGTH = 64;
        public static final int KEY_TYPE = 5;
        public static final byte[] KEY_BUNDLE_TYPE = new byte[]{5};
        public static final int MAX_MESSAGES = 2000;
        public static final String SKMSG = "skmsg";
        public static final String PKMSG = "pkmsg";
        public static final String MSG = "msg";
        public static final String UNAVAILABLE = "unavailable";
    }
}
