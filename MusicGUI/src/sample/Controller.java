package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import sample.model.Artist;
import sample.model.DataSource;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableView<Artist> artistTable;

    public void listArtist() {
        Task<ObservableList<Artist>> task = new GetAllArtistsTask();
        artistTable.itemsProperty().bind(task.valueProperty());
    }
}

class GetAllArtistsTask extends Task {

    @Override
    protected ObservableList<Artist> call() {
        return FXCollections.observableArrayList
                (DataSource.getInstance().queryArtists(DataSource.ORDER_BY_ASC));
    }
}
