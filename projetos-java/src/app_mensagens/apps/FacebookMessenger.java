package app_mensagens.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger...");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Facebook Messenger...");
	}
	public void salvarHistoricoMensagem() {
		System.out.println("O seu histórico de mensagens no Facebook foi salvo com sucesso!!" + "\r\n");
	};
}
