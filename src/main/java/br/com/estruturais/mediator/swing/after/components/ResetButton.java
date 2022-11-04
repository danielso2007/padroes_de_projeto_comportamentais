package br.com.estruturais.mediator.swing.after.components;

import javax.swing.JButton;
import br.com.estruturais.mediator.swing.after.mediator.Mediator;

public class ResetButton extends JButton {
    private static final long serialVersionUID = -6170178595314483794L;

    public ResetButton(Mediator mediator) {
        super("Reset");

        this.addActionListener(e -> mediator.reset());
    }
}
