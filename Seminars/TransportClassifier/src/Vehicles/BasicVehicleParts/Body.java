package Vehicles.BasicVehicleParts;

public class Body {
    private final String idBody; // номер кузова
    private final String bodyType; // тип кузова
    private final String bodyMaterial; // материал кузова
    private final float length; // длина
    private final float width; // ширина
    private final float height; // высота
    private final String bodyColour; // цвет кузова

    public Body(String idBody,
                String bodyType,
                String bodyMaterial,
                float length,
                float width,
                float height,
                String bodyColour) {
        this.idBody = idBody;
        this.bodyType = bodyType;
        this.bodyMaterial = bodyMaterial;
        this.length = length;
        this.width = width;
        this.height = height;
        this.bodyColour = bodyColour;
    }

    @Override
    public String toString() {
        return String.format("\n\t--Body--" +
                "\nBody number: " + idBody +
                "\nBody type: " + bodyType +
                "\nBody material: " + bodyMaterial +
                "\nLength of vehicle: " + length +
                "\nWidth of vehicle: " + width +
                "\nHeight of vehicle: " + height +
                "\nBody colour: " + bodyColour);
    }
}
