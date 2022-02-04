package Facade;

public class CheckFacade {
    private AvionApi avionApi;
    private HotelApi hotelApi;

    public CheckFacade(){
        avionApi = new AvionApi();
        hotelApi = new HotelApi();
    }

    public void buscar(String fechaIda,String fechaVuelta,String origen,String destino){
        avionApi.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelApi.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
