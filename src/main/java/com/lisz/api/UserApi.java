package com.lisz.api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@RequestMapping("/user")
public interface UserApi {

	/**
	 * 这里的@GetMapping @RequestParam 等注解是给OpenFeign看的，看到了URI之后，与客户端那个ConsumerApi接口的注释中
	 * 的"user-provider"组装成一个URL, 或者组装参数
	 */
	@GetMapping("/alive")
	public String alive();

	@GetMapping("/user/{id}")
	String getById(@PathVariable int id);

	@GetMapping("/map")
	public Map<Integer, String> map(@RequestParam int id); // 这里必须写@RequestParam， user-provider中的那个实现类可以不写，但最好都写上

	@GetMapping("/map2")
	public Map<Integer, String> map2(@RequestParam int id, @RequestParam String name);

	@GetMapping("/map3")
	public Map<Integer, String> map3(@RequestParam Map<String, Object> map);

	@PostMapping("/map4")
	public Map<Integer, String> map4(@RequestParam Map<String, Object> map);
}
