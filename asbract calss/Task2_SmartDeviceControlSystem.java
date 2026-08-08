/*
 * Task 2 - Smart Device Control System
 * Demonstrates: Interfaces and multiple inheritance of type
 * (a Java class can implement several interfaces at once).
 */

// ---- Interfaces, one capability each ----
interface WiFiEnabled {
    void connectWiFi();
}

interface VoiceControlled {
    void voiceCommand(String command);
}

interface MusicPlayer {
    void playMusic();
}

interface VideoStreaming {
    void streamVideo();
}

interface TemperatureMonitor {
    void monitorTemperature();
}

// ---- Device 1: implements 3 interfaces ----
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    private String deviceName;

    public SmartSpeaker(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi() {
        System.out.println(deviceName + ": Connected to Wi-Fi");
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println(deviceName + ": Executing voice command -> " + command);
    }

    @Override
    public void playMusic() {
        System.out.println(deviceName + ": Playing music");
    }
}

// ---- Device 2: implements 3 different interfaces ----
class SmartTV implements WiFiEnabled, VoiceControlled, VideoStreaming {
    private String deviceName;

    public SmartTV(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi() {
        System.out.println(deviceName + ": Connected to Wi-Fi");
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println(deviceName + ": Executing voice command -> " + command);
    }

    @Override
    public void streamVideo() {
        System.out.println(deviceName + ": Streaming video");
    }
}

// ---- Device 3: implements 2 interfaces ----
class SmartThermostat implements WiFiEnabled, TemperatureMonitor {
    private String deviceName;

    public SmartThermostat(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi() {
        System.out.println(deviceName + ": Connected to Wi-Fi");
    }

    @Override
    public void monitorTemperature() {
        System.out.println(deviceName + ": Monitoring room temperature");
    }
}

// ---- Device 4: implements 4 interfaces ----
class SmartPhone implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    private String deviceName;

    public SmartPhone(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi() {
        System.out.println(deviceName + ": Connected to Wi-Fi");
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println(deviceName + ": Executing voice command -> " + command);
    }

    @Override
    public void playMusic() {
        System.out.println(deviceName + ": Playing music");
    }

    @Override
    public void streamVideo() {
        System.out.println(deviceName + ": Streaming video");
    }
}

// ---- New device added later WITHOUT modifying any existing interface ----
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    private String deviceName;

    public SmartCar(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi() {
        System.out.println(deviceName + ": Connected to Wi-Fi");
    }

    @Override
    public void voiceCommand(String command) {
        System.out.println(deviceName + ": Executing voice command -> " + command);
    }

    @Override
    public void playMusic() {
        System.out.println(deviceName + ": Playing music through car speakers");
    }

    @Override
    public void streamVideo() {
        System.out.println(deviceName + ": Streaming video on dashboard display");
    }
}

// ---- Driver class ----
public class Task2_SmartDeviceControlSystem {
    public static void main(String[] args) {

        SmartSpeaker speaker = new SmartSpeaker("Echo Speaker");
        SmartTV tv = new SmartTV("Living Room TV");
        SmartThermostat thermostat = new SmartThermostat("Home Thermostat");
        SmartPhone phone = new SmartPhone("Smart Phone");
        SmartCar car = new SmartCar("Smart Car");

        System.out.println("---- Smart Speaker ----");
        speaker.connectWiFi();
        speaker.voiceCommand("Play jazz playlist");
        speaker.playMusic();

        System.out.println("\n---- Smart TV ----");
        tv.connectWiFi();
        tv.voiceCommand("Open streaming app");
        tv.streamVideo();

        System.out.println("\n---- Smart Thermostat ----");
        thermostat.connectWiFi();
        thermostat.monitorTemperature();

        System.out.println("\n---- Smart Phone ----");
        phone.connectWiFi();
        phone.voiceCommand("Call Mom");
        phone.playMusic();
        phone.streamVideo();

        System.out.println("\n---- Smart Car (added later) ----");
        car.connectWiFi();
        car.voiceCommand("Navigate home");
        car.playMusic();
        car.streamVideo();
    }
}
