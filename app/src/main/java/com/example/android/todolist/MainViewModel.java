package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    List<TaskEntry> taskEntries;
    public MainViewModel(@NonNull Application application) {
        super(application);
        AppDatabase appDatabase=AppDatabase.getInstance(this.getApplication());
        taskEntries=appDatabase.taskDao().loadAllTasks();
    }

    public List<TaskEntry> getTask()
    {
        return taskEntries;
    }
}
