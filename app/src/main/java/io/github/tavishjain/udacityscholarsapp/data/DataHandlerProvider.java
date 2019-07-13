package io.github.tavishjain.udacityscholarsapp.data;

public class DataHandlerProvider {

    public static DataHandler provide() {
        return AppDataHandler.getInstance();
    }

}
