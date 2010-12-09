package com.monstarlab.servicedroid.model;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.BaseColumns;

public abstract class Model {
	
	private Context ctx;
	
	public long _id;
	
	public Model(Context ctx) {
		this.ctx = ctx;
	}
	
	public void save() {
		if(isNew()) {
			insert();
		} else {
			update();
		}
	}
	
	public void delete() {
		
	}
	
	public static Model get(long id) {
		return null;
	}
	
	public static Model[] find(String where, String[] whereArgs) {
		return null;
	}
	
	protected boolean isNew() {
		return _id == 0;
	}
	
	protected void insert() {
		getContentResolver();
	}
	
	protected void update() {
		
	}
	
	private ContentResolver getContentResolver() {
		return this.ctx.getContentResolver();
	}
	
}
