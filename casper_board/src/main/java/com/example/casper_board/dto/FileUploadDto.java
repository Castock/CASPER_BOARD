package com.example.casper_board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileUploadDto {
    private String fileName;
    private String origfileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public FileUploadDto(String fileName, String origfileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.origfileName = origfileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

}
