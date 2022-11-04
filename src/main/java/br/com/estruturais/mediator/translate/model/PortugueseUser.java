package br.com.estruturais.mediator.translate.model;

import br.com.estruturais.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }

}
