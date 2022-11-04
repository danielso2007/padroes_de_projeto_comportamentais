package br.com.estruturais.state.headphone.after.states;

import br.com.estruturais.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
