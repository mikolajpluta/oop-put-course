public interface Forecast {
    float celsiusTemperature();
    float percentageHumidity();
    final class Fake implements Forecast{
        @Override
        public float celsiusTemperature() {
            return 21.37f;
        }
        @Override
        public float percentageHumidity() {
            return 9.11f;
        }
    }
}
