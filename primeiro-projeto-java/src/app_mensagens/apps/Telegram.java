package app_mensagens.apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram...");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Telegram..." + "\r\n");
	}
	public void salvarHistoricoMensagem() {
		System.out.println("O seu histórico de mensagens no Telegram foi salvo com sucesso!!" + "\r\n");
	}
}
