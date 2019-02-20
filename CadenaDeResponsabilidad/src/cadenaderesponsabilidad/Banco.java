/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

/**
 *
 * @author PATICO
 */
public class Banco implements IAprobador{
    private IAprobador next;
    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
        this.setNext(ejecutivo);
        
        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        this.setNext(lider);
        
        Gerente gerente = new Gerente();
        this.setNext(gerente);
        
        Director director = new Director();
        this.setNext(director);
        
        next.solicitudPrestamo(monto);
        
        
    }
    
}
