package general

class Contrato {
	String folio
    static belongsTo=[seguro:Seguro,hospital:Hospital]
    static constraints = {
    }

	String toString(){
		return folio
	}	

}
