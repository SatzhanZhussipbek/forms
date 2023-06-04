package com.company.orgforms.screen.form;

import io.jmix.ui.screen.*;
import com.company.orgforms.entity.Form;

@UiController("Form_.edit")
@UiDescriptor("form-edit.xml")
@EditedEntityContainer("formDc")
public class FormEdit extends StandardEditor<Form> {
}