package mock;

import java.util.Date;

public class Demandes {
    private int numeroDemande;
    private Date dateDemande;
    private Date dateEnlevement;
    private int siret;
    private int tournee;

    public Demandes(int numeroDemande, Date dateDemande, Date dateEnlevement, int siret, int tournee) {
        this.numeroDemande = numeroDemande;
        this.dateDemande = dateDemande;
        this.dateEnlevement = dateEnlevement;
        this.siret = siret;
        this.tournee = tournee;
    }

    public int getNumeroDemande() {
        return numeroDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public Date getDateEnlevement() {
        return dateEnlevement;
    }

    public int getSiret() {
        return siret;
    }

    public int getTournee() {
        return tournee;
    }
}
