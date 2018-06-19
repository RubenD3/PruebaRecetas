package com.mobile.avantgardeit.buscadorrecetas.data.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeResponseDto {

@SerializedName("title")
@Expose
private String title;
@SerializedName("version")
@Expose
private Double version;
@SerializedName("href")
@Expose
private String href;
@SerializedName("results")
@Expose
private List<ResultResponseDto> results = null;

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public Double getVersion() {
return version;
}

public void setVersion(Double version) {
this.version = version;
}

public String getHref() {
return href;
}

public void setHref(String href) {
this.href = href;
}

public List<ResultResponseDto> getResults() {
return results;
}

public void setResults(List<ResultResponseDto> results) {
this.results = results;
}

}