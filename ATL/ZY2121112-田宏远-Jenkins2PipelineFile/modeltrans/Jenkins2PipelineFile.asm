<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Jenkins2PipelineFile"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchPipeline2Pipeline():V"/>
		<constant value="__exec__"/>
		<constant value="Pipeline2Pipeline"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyPipeline2Pipeline(NTransientLink;):V"/>
		<constant value="__matchPipeline2Pipeline"/>
		<constant value="Pipeline"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Credential"/>
		<constant value="SourceCodeManagement"/>
		<constant value="3"/>
		<constant value="Trigger"/>
		<constant value="4"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="pf"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="cred"/>
		<constant value="source"/>
		<constant value="trig"/>
		<constant value="pt"/>
		<constant value="P"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="14:3-18:4"/>
		<constant value="__applyPipeline2Pipeline"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="5"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="6"/>
		<constant value="J.Credential2Git(JJ):J"/>
		<constant value="git"/>
		<constant value="J.Trigger2Trigger(J):J"/>
		<constant value="trigger"/>
		<constant value="15:12-15:14"/>
		<constant value="15:12-15:19"/>
		<constant value="15:4-15:19"/>
		<constant value="16:11-16:21"/>
		<constant value="16:37-16:41"/>
		<constant value="16:43-16:49"/>
		<constant value="16:11-16:50"/>
		<constant value="16:4-16:50"/>
		<constant value="17:15-17:25"/>
		<constant value="17:42-17:46"/>
		<constant value="17:15-17:47"/>
		<constant value="17:4-17:47"/>
		<constant value="link"/>
		<constant value="Credential2Git"/>
		<constant value="MJ!Credential;"/>
		<constant value="MJ!SourceCodeManagement;"/>
		<constant value="plf"/>
		<constant value="Git"/>
		<constant value="credentialsId"/>
		<constant value="repoURL"/>
		<constant value="url"/>
		<constant value="branch"/>
		<constant value="27:21-27:25"/>
		<constant value="27:21-27:30"/>
		<constant value="27:4-27:30"/>
		<constant value="28:11-28:17"/>
		<constant value="28:11-28:25"/>
		<constant value="28:4-28:25"/>
		<constant value="29:14-29:20"/>
		<constant value="29:14-29:27"/>
		<constant value="29:4-29:27"/>
		<constant value="26:5-30:5"/>
		<constant value="Trigger2Trigger"/>
		<constant value="MJ!Trigger;"/>
		<constant value="type"/>
		<constant value="38:15-38:19"/>
		<constant value="38:15-38:24"/>
		<constant value="38:7-38:24"/>
		<constant value="37:5-39:6"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="4"/>
			<findme/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<push arg="49"/>
			<push arg="4"/>
			<findme/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="29"/>
			<push arg="50"/>
			<push arg="4"/>
			<findme/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="51"/>
			<push arg="52"/>
			<push arg="4"/>
			<findme/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="53"/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<load arg="19"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="29"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="59"/>
			<load arg="51"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="60"/>
			<load arg="53"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="61"/>
			<push arg="46"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
			<enditerate/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="52" end="57"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="56" begin="6" end="59"/>
			<lve slot="2" name="58" begin="13" end="60"/>
			<lve slot="3" name="59" begin="20" end="61"/>
			<lve slot="4" name="60" begin="27" end="62"/>
			<lve slot="0" name="17" begin="0" end="63"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="67"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="68"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="51"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="68"/>
			<store arg="53"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="51"/>
			<load arg="53"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="69"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="76" begin="23" end="23"/>
			<lne id="77" begin="23" end="24"/>
			<lne id="78" begin="21" end="26"/>
			<lne id="79" begin="29" end="29"/>
			<lne id="80" begin="30" end="30"/>
			<lne id="81" begin="31" end="31"/>
			<lne id="82" begin="29" end="32"/>
			<lne id="83" begin="27" end="34"/>
			<lne id="84" begin="37" end="37"/>
			<lne id="85" begin="38" end="38"/>
			<lne id="86" begin="37" end="39"/>
			<lne id="87" begin="35" end="41"/>
			<lne id="65" begin="20" end="42"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="6" name="61" begin="19" end="42"/>
			<lve slot="2" name="56" begin="3" end="42"/>
			<lve slot="3" name="58" begin="7" end="42"/>
			<lve slot="4" name="59" begin="11" end="42"/>
			<lve slot="5" name="60" begin="15" end="42"/>
			<lve slot="0" name="17" begin="0" end="42"/>
			<lve slot="1" name="88" begin="0" end="42"/>
		</localvariabletable>
	</operation>
	<operation name="89">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="90"/>
			<parameter name="29" type="91"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="89"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="59"/>
			<load arg="29"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="92"/>
			<push arg="93"/>
			<push arg="62"/>
			<new/>
			<dup/>
			<store arg="51"/>
			<pcall arg="63"/>
			<pushf/>
			<pcall arg="64"/>
			<load arg="51"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="94"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="95"/>
			<call arg="30"/>
			<set arg="96"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="97"/>
			<call arg="30"/>
			<set arg="97"/>
			<pop/>
			<load arg="51"/>
		</code>
		<linenumbertable>
			<lne id="98" begin="29" end="29"/>
			<lne id="99" begin="29" end="30"/>
			<lne id="100" begin="27" end="32"/>
			<lne id="101" begin="35" end="35"/>
			<lne id="102" begin="35" end="36"/>
			<lne id="103" begin="33" end="38"/>
			<lne id="104" begin="41" end="41"/>
			<lne id="105" begin="41" end="42"/>
			<lne id="106" begin="39" end="44"/>
			<lne id="107" begin="26" end="45"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="92" begin="22" end="46"/>
			<lve slot="0" name="17" begin="0" end="46"/>
			<lve slot="1" name="58" begin="0" end="46"/>
			<lve slot="2" name="59" begin="0" end="46"/>
		</localvariabletable>
	</operation>
	<operation name="108">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="109"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="108"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="92"/>
			<push arg="52"/>
			<push arg="62"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="63"/>
			<pushf/>
			<pcall arg="64"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="110"/>
			<call arg="30"/>
			<set arg="110"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="111" begin="25" end="25"/>
			<lne id="112" begin="25" end="26"/>
			<lne id="113" begin="23" end="28"/>
			<lne id="114" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="92" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="60" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
