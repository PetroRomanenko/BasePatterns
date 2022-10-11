package com.ferros.basepatterns.behavioral.command.MyVariant;

import javax.sql.rowset.serial.SerialStruct;

public class CutCommand extends Command{
    CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty())return false;

        backup();
        String source= editor.textField.getText();
        editor.clipboard=editor.textField.getSelectedText();
        editor.textField.setText(source);
        return true;
    }
    private String cutString(String source){
        String start= source.substring(0,editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start+end;
    }
}
