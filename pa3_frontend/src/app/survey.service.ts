import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SurveyService {

  private apiUrl = 'http://localhost:8080/addSurvey'; 

  constructor(private http: HttpClient) { }

  submitSurvey(surveyData: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, surveyData);
  }
}
