import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-char-grouper-form',
  templateUrl: './char-grouper-form.component.html',
  styleUrls: ['./char-grouper-form.component.css'],
})
export class CharGrouperFormComponent implements OnInit {

  inputString: string;
  outputString: string;

  private restUrl: string;

  constructor(private http: HttpClient) {
    this.restUrl = 'http://localhost:8080/group';
  }

  ngOnInit() {
  }

  onSubmit() {
    const queryParam = new HttpParams().set('chars', this.inputString);
    this.http.get<Result>(this.restUrl, {params: queryParam}).subscribe(data => {
      this.outputString = data.output;
    });
  }
}

export interface Result {
  output: string;
}
