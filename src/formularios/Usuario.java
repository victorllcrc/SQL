/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Sherwin
 */
public class Usuario {
    boolean perClient;
    boolean perTecn;
    boolean perConsulta;

    public Usuario(boolean perClient, boolean perTecn, boolean perConsulta) {
        this.perClient = perClient;
        this.perTecn = perTecn;
        this.perConsulta = perConsulta;
    }

    public boolean isPerClient() {
        return perClient;
    }

    public void setPerClient(boolean perClient) {
        this.perClient = perClient;
    }

    public boolean isPerTecn() {
        return perTecn;
    }

    public void setPerTecn(boolean perTecn) {
        this.perTecn = perTecn;
    }

    public boolean isPerConsulta() {
        return perConsulta;
    }

    public void setPerConsulta(boolean perConsulta) {
        this.perConsulta = perConsulta;
    }
}
