package br.com.cliente;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fiap.servico.loja.appStore.LojaService;
import fiap.servico.loja.appStore.LojaServiceServiceLocator;

public class ClienteWeb {

	public static void main(String[] args) {
		
		try {
			LojaService ls = new LojaServiceServiceLocator().getLojaService();
			
			System.out.println("MENSAGEM WEB SERVICE : " +ls.consultaCod(401));
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}

	}

}
