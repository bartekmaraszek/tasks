import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {Http, HttpModule} from "@angular/http";
import {Task} from "./task.model";

@Injectable()
export class TasksService {

  constructor(private http: Http) {

  }

  getTasks() {
    return this.http.get("/api/tasks").map(response => response.json());
  }

  saveTask(task : Task, checked : boolean) {
    task.completed = checked;
    return this.http.post('/api/tasks/save', task)
      .map(
        response => response.json()
      );
  }
}
