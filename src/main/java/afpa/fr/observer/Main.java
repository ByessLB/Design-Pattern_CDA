package afpa.fr.observer;

public class Main {
    public static void main(String[] args) {
        // Création des capteurs
        Sensor smokeSensor = new SmokeSensor();
        Sensor temperatureSensor = new TemperatureSensor();
        Sensor no2Sensor = new NO2Sensor();

        // Création des systèmes d'alerte
        AlertObserver emailAlert = new EmailAlert();
        AlertObserver smartphoneNotification = new SmartphoneNotification();
        AlertObserver emergencyCall = new EmergencyCall();
        AlertObserver alarmTrigger = new AlarmTrigger();

        // Abonner les systèmes d'alerte aux capteurs
        smokeSensor.subscribe(emailAlert);
        smokeSensor.subscribe(smartphoneNotification);
        smokeSensor.subscribe(emergencyCall);
        smokeSensor.subscribe(alarmTrigger);

        temperatureSensor.subscribe(smartphoneNotification);
        temperatureSensor.subscribe(emailAlert);
        temperatureSensor.subscribe(alarmTrigger);

        no2Sensor.subscribe(emailAlert);
        no2Sensor.subscribe(smartphoneNotification);
        no2Sensor.subscribe(emergencyCall);

        // Simuler la détection
        smokeSensor.simulateDetectionEvent();
        temperatureSensor.simulateDetectionEvent();
        no2Sensor.simulateDetectionEvent();
    }
}
