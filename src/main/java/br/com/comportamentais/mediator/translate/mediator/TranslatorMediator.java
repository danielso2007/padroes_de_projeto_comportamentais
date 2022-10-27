package br.com.estruturais.mediator.translate.mediator;

import br.com.estruturais.mediator.translate.model.User;
import br.com.estruturais.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

    private Translator translator = new Translator();

    @Override
    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
