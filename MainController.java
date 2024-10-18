package com.example.employeemanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.employeemanagementsystem.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

    /**
     *
     * @author amir
     */
    public class MainController implements Initializable {


        @FXML
        private TableView<Person> table;

        @FXML
        private TableColumn<Person, Integer> id;

        @FXML
        private TableColumn<Person, String> name;

        @FXML
        private TableColumn<Person, String> lname;

        @FXML
        private TableColumn<Person, String> gmail;

        @FXML
        private TableColumn<Person, String> yahoo;

        @FXML
        private TableColumn<Person, String> phone;

        @FXML
        private TableColumn<Person, String> country;

        ObservableList<Person>listF;
        ObservableList<Person> getProductList(){
            ObservableList<Person> pers = FXCollections.observableArrayList();


            return pers;
        }
        int indexM = -1;




        ObservableList<Person> list = FXCollections.observableArrayList(

                new Person(1, "Amir", "code", "codeamirquestion@gmail.com", "mail@yahoo.com", "0254554444444","USA"),
                new Person(2, "Yassin", "code", "ab@gmail.com", "b@yahoo.com", "0254554444444","UK"),
                new Person(3, "Adam", "code", "bv@gmail.com", "c@yahoo.com", "0254555544444","Russia"),
                new Person(4, "Panda", "code", "d@gmail.com", "d@yahoo.com", "0254554444444","China"),
                new Person(5, "Sara", "code", "e@gmail.com", "e@yahoo.com", "0254554444444","France")
        );
        @Override
        public void initialize(URL url, ResourceBundle rb) {

            id.setCellValueFactory(new PropertyValueFactory<Person,Integer>("id"));
            name.setCellValueFactory(new PropertyValueFactory<Person,String>("name"));
            lname.setCellValueFactory(new PropertyValueFactory<Person,String>("lname"));
            gmail.setCellValueFactory(new PropertyValueFactory<Person,String>("gmail"));
            yahoo.setCellValueFactory(new PropertyValueFactory<Person,String>("yahoo"));
            phone.setCellValueFactory(new PropertyValueFactory<Person,String>("phone"));
            country.setCellValueFactory(new PropertyValueFactory<Person,String>("country"));

            //table.setItems(list);
          
            table.setItems(listF);


        }


    }


