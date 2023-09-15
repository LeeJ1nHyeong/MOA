package com.ssafy.moa.api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1346489765L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final ListPath<Foreigner, QForeigner> foreigner = this.<Foreigner, QForeigner>createList("foreigner", Foreigner.class, QForeigner.class, PathInits.DIRECT2);

    public final ListPath<Interest, QInterest> interest = this.<Interest, QInterest>createList("interest", Interest.class, QInterest.class, PathInits.DIRECT2);

    public final ListPath<Korean, QKorean> korean = this.<Korean, QKorean>createList("korean", Korean.class, QKorean.class, PathInits.DIRECT2);

    public final StringPath memberEmail = createString("memberEmail");

    public final NumberPath<Integer> memberExp = createNumber("memberExp", Integer.class);

    public final NumberPath<Integer> memberGender = createNumber("memberGender", Integer.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final BooleanPath memberIsForeigner = createBoolean("memberIsForeigner");

    public final QLevel memberLevel;

    public final StringPath memberName = createString("memberName");

    public final StringPath memberPassword = createString("memberPassword");

    public final DateTimePath<java.time.LocalDateTime> modifiedAt = createDateTime("modifiedAt", java.time.LocalDateTime.class);

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberLevel = inits.isInitialized("memberLevel") ? new QLevel(forProperty("memberLevel")) : null;
    }

}

