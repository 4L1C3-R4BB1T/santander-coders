import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AgendaService {
  apiUrl = "http://localhost:3000/agenda";
  
  constructor(private httpClient: HttpClient) { }
  
  listar(){
    return this.httpClient.get(this.apiUrl);
  }
  
  adicionar(agenda: any) {
    return this.httpClient.post(this.apiUrl, agenda);
  }
  
  excluir(id: number) {
    return this.httpClient.delete(this.apiUrl + '/' + id);
  }
  
  atualizar(agenda: any) {
    return this.httpClient.put(this.apiUrl+ '/' + agenda.id, agenda);
  }
}