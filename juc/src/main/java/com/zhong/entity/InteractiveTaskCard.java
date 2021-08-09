package com.zhong.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/6 16:18
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class InteractiveTaskCard {

	private String title;

	private String description;

	private String url;

	@JSONField(name = "task_id")
	private Long taskId;

	private List<Map<String,String>> btn;
}
