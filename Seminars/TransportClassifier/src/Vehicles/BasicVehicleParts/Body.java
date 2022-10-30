package Vehicles.BasicVehicleParts;

public class Body {
    private final String idBody; // номер кузова
    private final String bodyType; // тип кузова
    private final String bodyMaterial; // материал кузова
    private final float length; // длина
    private final float width; // ширина
    private final float height; // высота
    private final String bodyСolour; // цвет кузова

    public Body(String idBody,
                String bodyType,
                String bodyMaterial,
                float length,
                float width,
                float height,
                String bodyСolour){
        this.idBody = idBody;
        this.bodyType = bodyType;
        this.bodyMaterial = bodyMaterial;
        this.length = length;
        this.width = width;
        this.height = height;
        this.bodyСolour = bodyСolour;
    }
}
