package ApiRest.FisioApp.Model.Fichas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="exames")
public class Exame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 	
	private String fc;
	private String fr;
    private String pa;
    private int spo2;
    private int temperatura;
    private double peso;
    private double altura;
    private double imc;
    private String auscultaPulmonar;
    private String consciencia;
    private String formatoTorax;
    private String outros;
    private String viaDeAcessoDoAr;
    private String usoDeOxigenoterapia;
    private String horarioUsoDeOxigenoterapia;
    private String fiO2;
    private String padraoMuscularVentilatorio;
    private String ritmoVentilatorio;
    private String expansibilidadeToracica;
    private String expansibilidadeToracicaAssimetrica;
   
    @ManyToMany
    @JoinTable(
            name = "tab_exames_sinais",
            joinColumns = @JoinColumn(name = "exame_id"),
            inverseJoinColumns = @JoinColumn(name = "sinal_id")
    )
    private List<Sinais> sinais;
    
    
    private String demaisSinais;
    
    @ManyToMany
    @JoinTable(
            name = "tab_exames_sintomas",
            joinColumns = @JoinColumn(name = "exame_id"),
            inverseJoinColumns = @JoinColumn(name = "sintoma_id")
        )
    private List<Sintomas> sintomas;
    
    
    private String demaisSintomas;
    private String usoDeMusculaturaAcessoria;
    private String tosse;
    private String secrecao;
    private String dispneia;
    private String borg;
    private String classificacao;
    private String escalaModificadaDoMRC_Pacientes_Portadores_DPOC;
    private String cianose;
    private String avaliacaoPostural;
    private String palpacao;
     
    
    
             
              
    

	public Exame(String fc, String fr, String pa, int spo2, int temperatura, double peso, double altura, double imc,
			String auscultaPulmonar, String consciencia, String formatoTorax, String outros, String viaDeAcessoDoAr,
			String usoDeOxigenoterapia, String horarioUsoDeOxigenoterapia, String fiO2,
			String padraoMuscularVentilatorio, String ritmoVentilatorio, String expansibilidadeToracica,
			String expansibilidadeToracicaAssimetrica, List<Sinais> sinais, String demaisSinais,
			List<Sintomas> sintomas, String demaisSintomas, String usoDeMusculaturaAcessoria, String tosse,
			String secrecao, String dispneia, String borg, String classificacao,
			String escalaModificadaDoMRC_Pacientes_Portadores_DPOC, String cianose, String avaliacaoPostural,
			String palpacao) {
		super();
		this.fc = fc;
		this.fr = fr;
		this.pa = pa;
		this.spo2 = spo2;
		this.temperatura = temperatura;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.auscultaPulmonar = auscultaPulmonar;
		this.consciencia = consciencia;
		this.formatoTorax = formatoTorax;
		this.outros = outros;
		this.viaDeAcessoDoAr = viaDeAcessoDoAr;
		this.usoDeOxigenoterapia = usoDeOxigenoterapia;
		this.horarioUsoDeOxigenoterapia = horarioUsoDeOxigenoterapia;
		this.fiO2 = fiO2;
		this.padraoMuscularVentilatorio = padraoMuscularVentilatorio;
		this.ritmoVentilatorio = ritmoVentilatorio;
		this.expansibilidadeToracica = expansibilidadeToracica;
		this.expansibilidadeToracicaAssimetrica = expansibilidadeToracicaAssimetrica;
		this.sinais = sinais;
		this.demaisSinais = demaisSinais;
		this.sintomas = sintomas;
		this.demaisSintomas = demaisSintomas;
		this.usoDeMusculaturaAcessoria = usoDeMusculaturaAcessoria;
		this.tosse = tosse;
		this.secrecao = secrecao;
		this.dispneia = dispneia;
		this.borg = borg;
		this.classificacao = classificacao;
		this.escalaModificadaDoMRC_Pacientes_Portadores_DPOC = escalaModificadaDoMRC_Pacientes_Portadores_DPOC;
		this.cianose = cianose;
		this.avaliacaoPostural = avaliacaoPostural;
		this.palpacao = palpacao;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	public int getSpo2() {
		return spo2;
	}
	public void setSpo2(int spo2) {
		this.spo2 = spo2;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public String getAuscultaPulmonar() {
		return auscultaPulmonar;
	}
	public void setAuscultaPulmonar(String auscultaPulmonar) {
		this.auscultaPulmonar = auscultaPulmonar;
	}
	public String getConsciencia() {
		return consciencia;
	}
	public void setConsciencia(String consciencia) {
		this.consciencia = consciencia;
	}
	public String getFormatoTorax() {
		return formatoTorax;
	}
	public void setFormatoTorax(String formatoTorax) {
		this.formatoTorax = formatoTorax;
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	public String getViaDeAcessoDoAr() {
		return viaDeAcessoDoAr;
	}
	public void setViaDeAcessoDoAr(String viaDeAcessoDoAr) {
		this.viaDeAcessoDoAr = viaDeAcessoDoAr;
	}
	public String getUsoDeOxigenoterapia() {
		return usoDeOxigenoterapia;
	}
	public void setUsoDeOxigenoterapia(String usoDeOxigenoterapia) {
		this.usoDeOxigenoterapia = usoDeOxigenoterapia;
	}
	public String getHorarioUsoDeOxigenoterapia() {
		return horarioUsoDeOxigenoterapia;
	}
	public void setHorarioUsoDeOxigenoterapia(String horarioUsoDeOxigenoterapia) {
		this.horarioUsoDeOxigenoterapia = horarioUsoDeOxigenoterapia;
	}
	public String getFiO2() {
		return fiO2;
	}
	public void setFiO2(String fiO2) {
		this.fiO2 = fiO2;
	}
	public String getPadraoMuscularVentilatorio() {
		return padraoMuscularVentilatorio;
	}
	public void setPadraoMuscularVentilatorio(String padraoMuscularVentilatorio) {
		this.padraoMuscularVentilatorio = padraoMuscularVentilatorio;
	}
	public String getRitmoVentilatorio() {
		return ritmoVentilatorio;
	}
	public void setRitmoVentilatorio(String ritmoVentilatorio) {
		this.ritmoVentilatorio = ritmoVentilatorio;
	}
	public String getExpansibilidadeToracica() {
		return expansibilidadeToracica;
	}
	public void setExpansibilidadeToracica(String expansibilidadeToracica) {
		this.expansibilidadeToracica = expansibilidadeToracica;
	}
	public String getExpansibilidadeToracicaAssimetrica() {
		return expansibilidadeToracicaAssimetrica;
	}
	public void setExpansibilidadeToracicaAssimetrica(String expansibilidadeToracicaAssimetrica) {
		this.expansibilidadeToracicaAssimetrica = expansibilidadeToracicaAssimetrica;
	}
	
	public String getDemaisSinais() {
		return demaisSinais;
	}
	public void setDemaisSinais(String demaisSinais) {
		this.demaisSinais = demaisSinais;
	}
	
	public String getDemaisSintomas() {
		return demaisSintomas;
	}
	public void setDemaisSintomas(String demaisSintomas) {
		this.demaisSintomas = demaisSintomas;
	}
	public String getUsoDeMusculaturaAcessoria() {
		return usoDeMusculaturaAcessoria;
	}
	public void setUsoDeMusculaturaAcessoria(String usoDeMusculaturaAcessoria) {
		this.usoDeMusculaturaAcessoria = usoDeMusculaturaAcessoria;
	}
	public String getTosse() {
		return tosse;
	}
	public void setTosse(String tosse) {
		this.tosse = tosse;
	}
	public String getSecrecao() {
		return secrecao;
	}
	public void setSecrecao(String secrecao) {
		this.secrecao = secrecao;
	}
	public String getDispneia() {
		return dispneia;
	}
	public void setDispneia(String dispneia) {
		this.dispneia = dispneia;
	}
	public String getBorg() {
		return borg;
	}
	public void setBorg(String borg) {
		this.borg = borg;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getEscalaModificadaDoMRC_Pacientes_Portadores_DPOC() {
		return escalaModificadaDoMRC_Pacientes_Portadores_DPOC;
	}
	public void setEscalaModificadaDoMRC_Pacientes_Portadores_DPOC(String escalaModificadaDoMRC_Pacientes_Portadores_DPOC) {
		this.escalaModificadaDoMRC_Pacientes_Portadores_DPOC = escalaModificadaDoMRC_Pacientes_Portadores_DPOC;
	}
	public String getCianose() {
		return cianose;
	}
	public void setCianose(String cianose) {
		this.cianose = cianose;
	}
	public String getAvaliacaoPostural() {
		return avaliacaoPostural;
	}
	public void setAvaliacaoPostural(String avaliacaoPostural) {
		this.avaliacaoPostural = avaliacaoPostural;
	}
	public String getPalpacao() {
		return palpacao;
	}
	public void setPalpacao(String palpacao) {
		this.palpacao = palpacao;
	}
	public List<Sinais> getSinais() {
		return sinais;
	}
	public void setSinais(List<Sinais> sinais) {
		this.sinais = sinais;
	}
	public List<Sintomas> getSintomas() {
		return sintomas;
	}
	public void setSintomas(List<Sintomas> sintomas) {
		this.sintomas = sintomas;
	}
	

    
    

}
