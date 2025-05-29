package com.example.assignment2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TaxEaseApp extends Application {

    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Name:");
        TextField nameInput = new TextField();

        Label incomeLabel = new Label("Income:");
        TextField incomeInput = new TextField();

        Label deductionLabel = new Label("Deductions:");
        TextField deductionInput = new TextField();

        Label resultLabel = new Label();

        Button calcBtn = new Button("Calculate Tax");
        Button clearBtn = new Button("Clear");

        calcBtn.setOnAction(e -> {
            String name = nameInput.getText();
            double income = 0;
            double deduction = 0;

            try {
                income = Double.parseDouble(incomeInput.getText());
                deduction = Double.parseDouble(deductionInput.getText());

                User user = new User(name);
                TaxReturn tax = new TaxReturn(income, deduction);

                resultLabel.setText("Hi " + user.getName() + ", YOU MUST PAY RM " + String.format("%.2f", tax.getTaxAmount()) + " AS TAX");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        clearBtn.setOnAction(e -> {
            nameInput.clear();
            incomeInput.clear();
            deductionInput.clear();
            resultLabel.setText("");
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(
                nameLabel, nameInput,
                incomeLabel, incomeInput,
                deductionLabel, deductionInput,
                calcBtn, clearBtn,
                resultLabel
        );

        Scene scene = new Scene(layout, 400, 350);
        stage.setTitle("TaxEase - Simple Tax Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
