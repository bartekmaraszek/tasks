import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {Http, HttpModule} from "@angular/http";

@Injectable()
export class TasksService {

  constructor(private http: Http) {

  }

  getTasks() {
    return this.http.get("/api/tasks").map(response => response.json());
  }
}
