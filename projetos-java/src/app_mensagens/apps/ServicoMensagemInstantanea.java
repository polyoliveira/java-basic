package app_mensagens.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();
	protected abstract void salvarHistoricoMensagem();
    
	protected void validarConectadoInternet() {
		System.out.println("Internet validada.");
	}	
}
