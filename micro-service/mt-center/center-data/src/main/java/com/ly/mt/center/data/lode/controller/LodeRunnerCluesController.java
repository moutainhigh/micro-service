package com.ly.mt.center.data.lode.controller;

import com.ly.mt.center.data.lode.entity.LodeRunnerClues;
import com.ly.mt.core.base.entity.ResponseJson;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "淘金人线索接口")
@RestController
@RequestMapping("/data/center/lodeRunnerClues")
public class LodeRunnerCluesController {
    @ApiOperation(value = "保存LodeRunnerClues")
    @ApiResponses({
            @ApiResponse(code = 0, message = "保存成功!"),
            @ApiResponse(code = 1, message = "保存失败!")
    })
    @PostMapping("/inserLodeRunnerClues")
    public ResponseJson insertLodeRunnerClues(@RequestBody LodeRunnerClues lodeRunnerClues) {
        return null;
    }


    @ApiOperation(
            value = "删除LodeRunnerClues",
            notes = "删除条件id不能为空"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "删除成功!"),
            @ApiResponse(code = 1, message = "删除失败!")
    })
    @PostMapping("/deleteLodeRunnerClues")
    public ResponseJson deleteLodeRunnerClues() {
        return null;
    }


    @ApiOperation(
            value = "更新LodeRunnerClues",
            notes = "1、字段值为null时不更新,为空符串时更新数据库字段为空  \n" +
                    "2、更新条件id不能为空  \n"
    )
    @ApiResponses({
            @ApiResponse(code = 0, message = "更新成功!"),
            @ApiResponse(code = 1, message = "更新失败!")
    })
    @PostMapping("/updateLodeRunnerClues")
    public ResponseJson updateLodeRunnerClues(@RequestBody LodeRunnerClues lodeRunnerClues) {
        return null;
    }


    @ApiOperation(value = "查询LodeRunnerClues", notes = "查询条件id不能为空")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 0, message = "查询成功!"),
            @ApiResponse(code = 1, message = "查询失败!")
    })
    @PostMapping("/getLodeRunnerClues")
    public ResponseJson getLodeRunnerClues() {
        return null;
    }
}