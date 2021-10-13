import java.util.Locale;

public interface Converter {

    static double convert(String convert_to, String unit, double value) {
        if (Main.enumList.contains(UnitVariables.valueOf(unit.toUpperCase(Locale.ROOT)))
                && Main.enumList.contains(UnitVariables.valueOf(convert_to.toUpperCase(Locale.ROOT))) && value >= 0d) {

            if (unit.equals("cm") && convert_to.equals("m")) {
                return cmToM(value);
            } else if (unit.equals("cm") && convert_to.equals("inch")) {
                return cmToInch(value);
            } else if (unit.equals("cm") && convert_to.equals("ft")) {
                return cmToFt(value);
            } else if (unit.equals("cm") && convert_to.equals("mm")) {
                return cmToMm(value);
            } else if (unit.equals("cm") && convert_to.equals("yd")) {
                return cmToYd(value);
            } else if (unit.equals("cm") && convert_to.equals("km")) {
                return cmToKm(value);
            } else if (unit.equals("m") && convert_to.equals("cm")) {
                return mToCm(value);
            } else if (unit.equals("m") && convert_to.equals("inch")) {
                return mToInch(value);
            } else if (unit.equals("m") && convert_to.equals("ft")) {
                return mToFt(value);
            } else if (unit.equals("m") && convert_to.equals("mm")) {
                return mToMm(value);
            } else if (unit.equals("m") && convert_to.equals("yd")) {
                return mToYd(value);
            } else if (unit.equals("m") && convert_to.equals("km")) {
                return mToKm(value);
            } else if (unit.equals("inch") && convert_to.equals("cm")) {
                return inchToCm(value);
            } else if (unit.equals("inch") && convert_to.equals("m")) {
                return inchToM(value);
            } else if (unit.equals("inch") && convert_to.equals("ft")) {
                return inchToFt(value);
            } else if (unit.equals("inch") && convert_to.equals("mm")) {
                return inchToMm(value);
            } else if (unit.equals("inch") && convert_to.equals("yd")) {
                return inchToYd(value);
            } else if (unit.equals("inch") && convert_to.equals("km")) {
                return inchToKm(value);
            } else if (unit.equals("ft") && convert_to.equals("cm")) {
                return ftToCm(value);
            } else if (unit.equals("ft") && convert_to.equals("m")) {
                return ftToM(value);
            } else if (unit.equals("ft") && convert_to.equals("inch")) {
                return ftToInch(value);
            } else if (unit.equals("ft") && convert_to.equals("mm")) {
                return ftToMm(value);
            } else if (unit.equals("ft") && convert_to.equals("yd")) {
                return ftToYd(value);
            } else if (unit.equals("ft") && convert_to.equals("km")) {
                return ftToKm(value);
            } else if (unit.equals("mm") && convert_to.equals("m")) {
                return mmToM(value);
            } else if (unit.equals("mm") && convert_to.equals("cm")) {
                return mmToCm(value);
            } else if (unit.equals("mm") && convert_to.equals("in")) {
                return mmToInch(value);
            } else if (unit.equals("mm") && convert_to.equals("ft")) {
                return mmToFt(value);
            } else if (unit.equals("mm") && convert_to.equals("yd")) {
                return mmToYd(value);
            } else if (unit.equals("mm") && convert_to.equals("km")) {
                return mmToKm(value);
            } else if (unit.equals("yd") && convert_to.equals("m")) {
                return ydToM(value);
            } else if (unit.equals("yd") && convert_to.equals("cm")) {
                return ydToCm(value);
            } else if (unit.equals("yd") && convert_to.equals("in")) {
                return ydToInch(value);
            } else if (unit.equals("yd") && convert_to.equals("ft")) {
                return ydToFt(value);
            } else if (unit.equals("yd") && convert_to.equals("mm")) {
                return ydToMm(value);
            } else if (unit.equals("yd") && convert_to.equals("km")) {
                return ydToKm(value);
            } else if (unit.equals("km") && convert_to.equals("m")) {
                return kmToM(value);
            } else if (unit.equals("km") && convert_to.equals("cm")) {
                return kmToCm(value);
            } else if (unit.equals("km") && convert_to.equals("in")) {
                return kmToInch(value);
            } else if (unit.equals("km") && convert_to.equals("ft")) {
                return kmToFt(value);
            } else if (unit.equals("km") && convert_to.equals("mm")) {
                return kmToMm(value);
            } else if (unit.equals("km") && convert_to.equals("yd")) {
                return kmToYd(value);
            }
        }

        return 0;
    }

    static double mToCm(double value) {
        return value * 100d;
    }

    static double mToInch(double value) {
        return value * 39.3701d;
    }

    static double mToFt(double value) {
        return value * 3.28084d;
    }

    static double mToMm(double value) {
        return value * 1000;
    }

    static double mToYd(double value) {
        return value * 1.09361d;
    }

    static double mToKm(double value) {
        return value * 0.001d;
    }

    static double cmToM(double value) {
        return value * 0.01d;
    }

    static double cmToInch(double value) {
        return value * 0.393701d;
    }

    static double cmToFt(double value) {
        return value * 0.0328084d;
    }

    static double cmToMm(double value) {
        return value * 10;
    }

    static double cmToYd(double value) {
        return value * 0.0109361d;
    }

    static double cmToKm(double value) { // test!!!
        return value * 1e-5;
    }

    static double inchToM(double value) {
        return value * 0.0254d;
    }

    static double inchToCm(double value) {
        return value * 2.54d;
    }

    static double inchToFt(double value) {
        return value * 0.0833333d;
    }

    static double inchToMm(double value) {
        return value * 25.4d;
    }

    static double inchToYd(double value) {
        return value * 0.0277778d;
    }

    static double inchToKm(double value) { // test!!!
        return value * 2.54e-5d;
    }

    static double ftToM(double value) {
        return value * 0.3048d;
    }

    static double ftToCm(double value) {
        return value * 30.48d;
    }

    static double ftToInch(double value) {
        return value * 12;
    }

    static double ftToMm(double value) {
        return value * 304.8d;
    }

    static double ftToYd(double value) {
        return value * 0.333333d;
    }

    static double ftToKm(double value) {
        return value * 0.0003048d;
    }

    static double mmToM(double value) {
        return value * 0.001d;
    }

    static double mmToCm(double value) {
        return value * 0.1d;
    }

    static double mmToInch(double value) {
        return value * 0.0393701d;
    }

    static double mmToFt(double value) {
        return value * 0.00328084d;
    }

    static double mmToYd(double value) {
        return value * 0.00109361d;
    }

    static double mmToKm(double value) { /////test!!!!
        return value * 1e-6d;
    }

    static double ydToM(double value) {
        return value * 0.9144d;
    }

    static double ydToCm(double value) {
        return value * 91.44d;
    }

    static double ydToInch(double value) {
        return value * 36;
    }

    static double ydToFt(double value) {
        return value * 3;
    }

    static double ydToMm(double value) {
        return value * 914.4d;
    }

    static double ydToKm(double value) {
        return value * 0.9144d;
    }

    static double kmToM(double value) {
        return value * 1000;
    }

    static double kmToCm(double value) {
        return value * 100000;
    }

    static double kmToInch(double value) {
        return value * 39370.1d;
    }

    static double kmToFt(double value) {
        return value * 3280.84d;
    }

    static double kmToMm(double value) { /// test!!!!
        return value * 1e+6d;
    }

    static double kmToYd(double value) {
        return value * 1093.61d;
    }

}
