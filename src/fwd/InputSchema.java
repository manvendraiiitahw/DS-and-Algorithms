package fwd;


public class InputSchema {

    public int storeNbr;
    public int ksnNbr;
    public int filler1;
    public char ksnInd;
    public char assrtInd;
    public char specInstrInd;
    public char gtinInd;
    public char slsLnkInd;
    public char filler2;
    public int dcOverhead;
    public char authStores;
    public char requiredInd;
    public int source;
    public char filler3;

    public int getStoreNbr() {
        return storeNbr;
    }
    public void setStoreNbr(int storeNbr) {
        this.storeNbr = storeNbr;
    }
    public int getKsnNbr() {
        return ksnNbr;
    }
    public void setKsnNbr(int ksnNbr) {
        this.ksnNbr = ksnNbr;
    }
    public int getFiller1() {
        return filler1;
    }
    public void setFiller1(int filler1) {
        this.filler1 = filler1;
    }
    public char getKsnInd() {
        return ksnInd;
    }
    public void setKsnInd(char ksnInd) {
        this.ksnInd = ksnInd;
    }
    public char getAssrtInd() {
        return assrtInd;
    }
    public void setAssrtInd(char assrtInd) {
        this.assrtInd = assrtInd;
    }
    public char getSpecInstrInd() {
        return specInstrInd;
    }
    public void setSpecInstrInd(char specInstrInd) {
        this.specInstrInd = specInstrInd;
    }
    public char getGtinInd() {
        return gtinInd;
    }
    public void setGtinInd(char gtinInd) {
        this.gtinInd = gtinInd;
    }
    public char getSlsLnkInd() {
        return slsLnkInd;
    }
    public void setSlsLnkInd(char slsLnkInd) {
        this.slsLnkInd = slsLnkInd;
    }
    public char getFiller2() {
        return filler2;
    }
    public void setFiller2(char filler2) {
        this.filler2 = filler2;
    }
    public int getDcOverhead() {
        return dcOverhead;
    }
    public void setDcOverhead(int dcOverhead) {
        this.dcOverhead = dcOverhead;
    }
    public char getAuthStores() {
        return authStores;
    }
    public void setAuthStores(char authStores) {
        this.authStores = authStores;
    }
    public char getRequiredInd() {
        return requiredInd;
    }
    public void setRequiredInd(char requiredInd) {
        this.requiredInd = requiredInd;
    }
    public int getSource() {
        return source;
    }
    public void setSource(int source) {
        this.source = source;
    }
    public char getFiller3() {
        return filler3;
    }
    public void setFiller3(char filler3) {
        this.filler3 = filler3;
    }

	/*
	@Override
	public String toString() {
		return "KsnReqSchema [storeNbr=" + storeNbr + ", ksnNbr=" + ksnNbr + ", filler1=" + filler1 + ", ksnInd="
				+ ksnInd + ", assrtInd=" + assrtInd + ", specInstrInd=" + specInstrInd + ", gtinInd=" + gtinInd
				+ ", slsLnkInd=" + slsLnkInd + ", filler2=" + filler2 + ", dcOverhead=" + dcOverhead + ", authStores="
				+ authStores + ", requiredInd=" + requiredInd + ", source=" + source + ", filler3=" + filler3
				+ ", getStoreNbr()=" + getStoreNbr() + ", getKsnNbr()=" + getKsnNbr() + ", getFiller1()=" + getFiller1()
				+ ", getKsnInd()=" + getKsnInd() + ", getAssrtInd()=" + getAssrtInd() + ", getSpecInstrInd()="
				+ getSpecInstrInd() + ", getGtinInd()=" + getGtinInd() + ", getSlsLnkInd()=" + getSlsLnkInd()
				+ ", getFiller2()=" + getFiller2() + ", getDcOverhead()=" + getDcOverhead() + ", getAuthStores()="
				+ getAuthStores() + ", getRequiredInd()=" + getRequiredInd() + ", getSource()=" + getSource()
				+ ", getFiller3()=" + getFiller3() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	*/

    public String toString() {
        return storeNbr + "|"+ksnNbr +"|"+ filler1 + "|" + ksnInd  + "|" + assrtInd  + "|" + specInstrInd  + "|" + gtinInd
                + "|" + slsLnkInd  + "|" + filler2  + "|" + dcOverhead  + "|" + authStores  + "|" + requiredInd  + "|" +source + "|" + filler3;
    }






}
