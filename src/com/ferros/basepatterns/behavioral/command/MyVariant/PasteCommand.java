package com.ferros.basepatterns.behavioral.command.MyVariant;

public class PasteCommand extends Command{
    PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard==null||editor.clipboard.isEmpty())return false;

        backup();
        editor.textField.insert(editor.clipboard,editor.textField.getCaretPosition());
        return true;
    }
}
