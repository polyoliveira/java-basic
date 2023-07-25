package app_mensagens.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger...");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo MSN Messenger...");
	}
	public void salvarHistoricoMensagem() {
		System.out.println("O seu histórico de mensagens no MSN foi salvo com sucesso!!" + "\r\n");
	}
}