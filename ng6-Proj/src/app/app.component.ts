import { Observable } from 'rxjs';
import { Component } from '@angular/core';
import { Http } from '@angular/http';
import { map } from 'rxjs/operators';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'Donnghi';
    person;

    constructor(private http: Http) {}

    fetchDataFromServer() {
        this.person = this.http.get('/api/v1/people').pipe(map(res => res.json()));
    }

}
