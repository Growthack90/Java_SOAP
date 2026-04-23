# Java SOAP — Conversore Euro/Dollaro

Esempio minimale di Web Service SOAP in Java con **Jakarta XML WS** (JAX-WS).  
Il server espone un endpoint che converte Euro in Dollari; il client lo invoca come se fosse una normale chiamata a metodo.

---

## Prerequisiti

| Strumento | Versione minima |
|-----------|----------------|
| JDK | 17+ (testato con 25 LTS) |
| Apache Maven | 3.9+ |

Verifica l'installazione:
```powershell
java -version
mvn --version
```

Per installare Maven guarda la seguente guida http://marcoparoni.altervista.org/installare-maven-su-windows-10/?doing_wp_cron=1742306737.5766460895538330078125

---

## Struttura del progetto

```
JAVA_SOAP/
├── pom.xml
├── SoapServer/
│   ├── Conversore.java       # Interfaccia @WebService
│   ├── ConversoreImpl.java   # Implementazione del servizio
│   └── ServerApp.java        # Avvia l'endpoint su localhost:8080
└── SoapClient/
    └── ClientApp.java        # Chiama il servizio e stampa il risultato
```

---

## Come eseguire

### 1 — Scarica il progetto

```powershell
git clone <url-del-repository>
cd JAVA_SOAP
```

### 2 — Avvia il server (Terminale 1)

```powershell
mvn compile exec:java "-Dexec.mainClass=ServerApp"
```

Il server rimarrà in ascolto. Puoi verificare che sia attivo aprendo nel browser:  
👉 http://localhost:8080/conversore?wsdl

Vedrai un XML: è il **WSDL**, il contratto che descrive il servizio.

### 3 — Esegui il client (Terminale 2, mentre il server è attivo)

```powershell
mvn compile exec:java "-Dexec.mainClass=ClientApp"
```

Output atteso:
```
100 Euro equivalgono a: 109.0 Dollari
```

---

## Dipendenze principali

| Libreria | Versione | Ruolo |
|----------|----------|-------|
| `jakarta.xml.ws-api` | 4.0.0 | API standard JAX-WS |
| `jaxws-rt` | 4.0.0 | Implementazione runtime (Eclipse Metro) |
