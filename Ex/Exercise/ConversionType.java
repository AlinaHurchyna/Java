package Ex.Exercise;

public enum ConversionType {METERS_TO_YARDS(value -> value * 1.09361f),
    YARDS_TO_METERS(value -> value / 1.09361f),
    CENTIMETERS_TO_INCHES(value -> value * 0.393701f),
    INCHES_TO_CENTIMETERS(value -> value / 0.393701f),
    KILOMETERS_TO_MILES(value -> value * 0.621371f),
    MILES_TO_KILOMETERS(value -> value / 0.621371f);

    private final Converter converter;

    ConversionType(final Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }

}
