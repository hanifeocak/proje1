
public class Otmt {

private  String urunler;
private  Double  fiyatlar;
private  String secilenUrunler;
private  Integer secilenUrunAdet;
private  String secilen;
public Otmt(String urunler, Double fiyatlar, String secilenUrunler, Integer secilenUrunAdet, String secilen) {
	super();
	this.urunler = urunler;
	this.fiyatlar = fiyatlar;
	this.secilenUrunler = secilenUrunler;
	this.secilenUrunAdet = secilenUrunAdet;
	this.secilen = secilen;
}
public String getUrunler() {
	return urunler;


}
public void setUrunler(String urunler) {
	this.urunler = urunler;


}
public Double getFiyatlar() {
	return fiyatlar;
}
public void setFiyatlar(Double fiyatlar) {
	this.fiyatlar = fiyatlar;
}
public String getSecilenUrunler() {
	return secilenUrunler;
}
public void setSecilenUrunler(String secilenUrunler) {
	this.secilenUrunler = secilenUrunler;
}
public Integer getSecilenUrunAdet() {
	return secilenUrunAdet;
}
public void setSecilenUrunAdet(Integer secilenUrunAdet) {
	this.secilenUrunAdet = secilenUrunAdet;
}
public String getSecilen() {
	return secilen;
}
public void setSecilen(String secilen) {
	this.secilen = secilen;
}











}
