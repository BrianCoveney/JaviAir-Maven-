package helpers;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.Optional;

/**
 * Created by brian on 08/11/16.
 */
public final class UtilityClass {


    private UtilityClass() {
        // constructor not called
    }


    // insert the airplane icons between the flight destinations, and the flight times
    public static HBox insertIcon() {
        Image image = new Image("airplane.png");

        ImageView imageView = new ImageView(image);
        imageView.setImage(image);
        imageView.setFitWidth(30);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);
        imageView.getStyleClass().add("imageView");

        HBox hBoxImage = new HBox();
        hBoxImage.getChildren().add(imageView);

        return hBoxImage;
    }


    // user clicks continue without selecting a flight
    public static void errorMessageFlight() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("You need to select a flight first");
        alert.showAndWait();
    }

    // user clicks continue without selecting a flight
    public static void errorMessageDate() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("You need to select a date");
        alert.showAndWait();
    }


    
    public static void errorMessageInput() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("The text you entered does not match a flight");
        alert.showAndWait();
    }

    public static void errorMessageName() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Please check your name entry");
        alert.showAndWait();
    }

    public static void errorMessagePassengerName() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Please check your name entry");
        alert.showAndWait();
    }


    
    public static void errorMessageAddCustomer() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Passenger details cannot be empty");
        alert.showAndWait();
    }

    
    public static void errorMessageDatesNotPossible() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Please check your selected dates");
        alert.showAndWait();
    }

    
    public static void errorMessageNoBagsForBabies() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Baggage not allowed for babies");
        alert.showAndWait();
    }

    
    public static void errorMessageUnder18() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Booking cannot be made without an Adult. \nPlease add Adult passenger first.");
        alert.showAndWait();
    }


    
    public static void errorMessageMaxTwoChildren() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Maximum of two children per booking.");
        alert.showAndWait();
    }

    
    public static void errorMessageCreditCardNumber() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Invalid Credit Card Number");
        alert.showAndWait();
    }


    
    public static void errorMessageCreditCardCCVNumber() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Invalid Credit Card CCV Number");
        alert.showAndWait();
    }

    
    public static void errorMessageDNINumber() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Invalid DNI Number");
        alert.showAndWait();
    }

    
    public static void errorMessageDateOfBirth() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Invalid date of birth");
        alert.showAndWait();
    }


    public static void errorMessageSpanishOnlyDNI() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setContentText("Spanish rebate is only valid for flights to or from Malaga and Madrid");
        alert.showAndWait();
    }

    
    public static void orderReceived() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Input Error");
        alert.setContentText("Thank you. Your order has been received.");
        alert.showAndWait();
    }



    public static void confirmBoxCloseApp() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Close Program");
        alert.setContentText("Do you want to close the program?");

        Optional<ButtonType> choice = alert.showAndWait();

        if (choice.isPresent() && choice.get().equals(ButtonType.OK)) {
            Platform.exit();
        } else if (choice.isPresent() && choice.get().equals(ButtonType.CANCEL)) {
            alert.close();
        }
    }





}
