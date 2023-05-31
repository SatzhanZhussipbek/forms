package com.company.orgforms.screen.form;

import io.jmix.reportsui.runner.UiReportRunner;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.DateField;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@UiController("FormScreen")
@UiDescriptor("form-screen.xml")
public class FormScreen extends Screen {

    @Autowired
    private UiReportRunner uiReportRunner;
    @Autowired
    private TextField<String> nameField;
    @Autowired
    private DateField<LocalDate> dateOfBirth;

    @Subscribe("printBtn")
    public void onPrintBtnClick(Button.ClickEvent event) {
        uiReportRunner.byReportCode("form")
                .addParam("name", nameField.getValue())
                .addParam("date of birth", dateOfBirth.getValue())
                .runAndShow();
    }
}