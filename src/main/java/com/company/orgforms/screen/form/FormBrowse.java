package com.company.orgforms.screen.form;

import io.jmix.ui.screen.*;
import com.company.orgforms.entity.Form;

@UiController("Form_.browse")
@UiDescriptor("form-browse.xml")
@LookupComponent("formsTable")
public class FormBrowse extends StandardLookup<Form> {
}