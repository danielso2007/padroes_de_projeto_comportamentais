package br.com.estruturais.mediator.translate.mediator;

import br.com.estruturais.mediator.translate.model.User;

public class ChatMediator extends Mediator {

    @Override
    public String getMessage(String message, User to, User from) {
        return message;
    }
}
