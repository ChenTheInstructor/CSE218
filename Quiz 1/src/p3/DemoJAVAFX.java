package p3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DemoJAVAFX extends Application {

    private TextField nameField;
    private TextField gpaField;
    private TextArea outputArea;

    private StudentPriorityQueue queue;

    @Override
    public void start(Stage stage) {

        queue = new StudentPriorityQueue(100);

        // -------------------------
        // Input controls
        // -------------------------

        Label nameLabel = new Label("Name:");
        nameField = new TextField();
        nameField.setPrefColumnCount(10);

        Label gpaLabel = new Label("GPA:");
        gpaField = new TextField();
        gpaField.setPrefColumnCount(5);

        HBox inputBox = new HBox(
                10,
                nameLabel,
                nameField,
                gpaLabel,
                gpaField
        );

        // -------------------------
        // Buttons
        // -------------------------

        Button addButton =
                new Button("Add Student");

        Button removeButton =
                new Button("Remove Highest");

        Button peekButton =
                new Button("Peek Highest");

        Button displayButton =
                new Button("Display Queue");

        HBox buttonBox = new HBox(
                10,
                addButton,
                removeButton,
                peekButton,
                displayButton
        );

        // -------------------------
        // Output area
        // -------------------------

        outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setPrefRowCount(15);

        // -------------------------
        // Add Student
        // -------------------------

        addButton.setOnAction(e -> {

            try {

                String name =
                        nameField.getText().trim();

                double gpa =
                        Double.parseDouble(
                                gpaField.getText());

                if (name.isEmpty()) {
                    throw new IllegalArgumentException(
                            "Name cannot be empty.");
                }

                if (gpa < 0.0 || gpa > 4.0) {
                    throw new IllegalArgumentException(
                            "GPA must be between 0.0 and 4.0.");
                }

                Student student =
                        new Student(name, gpa);

                queue.insert(student);

                outputArea.setText(
                        "Added: " + student +
                        "\n\nCurrent Queue:\n" +
                        queue);

                nameField.clear();
                gpaField.clear();

            } catch (NumberFormatException ex) {

                showError(
                        "Please enter a valid GPA.");

            } catch (Exception ex) {

                showError(ex.getMessage());
            }
        });

        // -------------------------
        // Remove Highest
        // -------------------------

        removeButton.setOnAction(e -> {

            try {

                Student student = queue.remove();

                outputArea.setText(
                        "Removed highest-priority student:\n"
                        + student
                        + "\n\nCurrent Queue:\n"
                        + queue);

            } catch (Exception ex) {

                showError(ex.getMessage());
            }
        });

        // -------------------------
        // Peek Highest
        // -------------------------

        peekButton.setOnAction(e -> {

            try {

                Student student = queue.peek();

                outputArea.setText(
                        "Highest-priority student:\n"
                        + student
                        + "\n\nCurrent Queue:\n"
                        + queue);

            } catch (Exception ex) {

                showError(ex.getMessage());
            }
        });

        // -------------------------
        // Display Queue
        // -------------------------

        displayButton.setOnAction(e -> {

            outputArea.setText(
                    "Current Queue:\n" + queue);
        });

        // -------------------------
        // Main layout
        // -------------------------

        VBox root = new VBox(
                15,
                inputBox,
                buttonBox,
                outputArea
        );

        root.setPadding(new Insets(15));

        Scene scene =
                new Scene(root, 600, 400);

        stage.setTitle(
                "Student Priority Queue");

        stage.setScene(scene);
        stage.show();
    }

    // -------------------------
    // Error dialog
    // -------------------------

    private void showError(String message) {

        Alert alert =
                new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}